package mokito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.studyTest.classsMocks.EnviarMensagem;
import org.studyTest.classsMocks.Mensagem;

@ExtendWith(MockitoExtension.class)
public class TestandoMenssagemTeste {
    @Spy
    EnviarMensagem enviarMensagem;
    @Test
    void  verificarinteracao(){
       Mensagem msg = new Mensagem("Opa LELE");
        Mockito.verifyNoInteractions(enviarMensagem); // VERIFICO SE NÂO OUVE INTERAÇÂO COM ESSA REFERENCIA
        enviarMensagem.EnviarMensagem(msg);
        Mockito.verify(enviarMensagem).EnviarMensagem(msg); // CHKO NOVAMENTE SE ESS AREFERENCIA TEVE A INTERAÇÃO QUE ESPECIFIQUEI

        Assertions.assertFalse(enviarMensagem.getInbox().isEmpty());

    }

    @Test
    void validarOrder(){
        InOrder order = Mockito.inOrder(enviarMensagem);
        enviarMensagem.EnviarMensagem( new Mensagem("Opa LELE"));
        order.verify(enviarMensagem).avisarRemetente();
        order.verify(enviarMensagem).avisarEmissor();
    }

    @Test
    void validarVezesChamada(){
        enviarMensagem.EnviarMensagem(new Mensagem("TESTANDO"));
        enviarMensagem.avisarEmissor();
        enviarMensagem.avisarEmissor();
        Mockito.verify(enviarMensagem, Mockito.times(3)).avisarEmissor();
    }


}
