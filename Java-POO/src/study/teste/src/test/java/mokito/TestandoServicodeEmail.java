package mokito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.studyTest.classsMocks.servicoEmail.Email;
import org.studyTest.classsMocks.servicoEmail.Plataforma;
import org.studyTest.classsMocks.servicoEmail.ServicoEmail;

@ExtendWith(MockitoExtension.class)
public class TestandoServicodeEmail {
    @Mock
    private Plataforma plataforma;


    @InjectMocks
    private ServicoEmail servicoEmail;

    @Captor
    ArgumentCaptor<Email> captor;

    @Test
      void  verificarArgumentos(){

        String dest = "eu";
        String msg = "Hello World";

        servicoEmail.enviarEmail(dest,msg,true);
        Mockito.verify(plataforma).enviarEmail(captor.capture());

        Email emailCapturado = captor.getValue();

        Assertions.assertEquals(emailCapturado.getMsg(),msg);
        Assertions.assertEquals(emailCapturado.getDestinatario(),dest);

    }



}
