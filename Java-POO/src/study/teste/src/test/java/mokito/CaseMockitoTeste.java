package mokito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.studyTest.classJunit.Pessoa;
import org.studyTest.classsMocks.ApiCorreios;
import org.studyTest.classsMocks.CadastrarPessoa;
import org.studyTest.classsMocks.Endereco;

import static org.mockito.ArgumentMatchers.*;

@ExtendWith(MockitoExtension.class)
public class CaseMockitoTeste {

@Mock // EM VES D EPEGAR DA API EU CRIO DADOS FICTCIOS PARA SEREM LANÇADOS
    ApiCorreios apiCorreios;
@InjectMocks // COMO O MEU OBJETO USA O OBJETO MOCADO EU INJETO PARA QUELE POSAS FAZER USO
    CadastrarPessoa cadastrarPessoa;

@Test
    void validarCadastro(){
   Endereco endereco = new Endereco("RUA", 1234, 13);
    Mockito.when(apiCorreios.buscarCep(1234)).thenReturn(endereco);
   Pessoa person =  cadastrarPessoa.cadastrarPessoa("Gonçlaves",23,1234);
    Assertions.assertEquals("Gonçlaves",person.getNome());
    Assertions.assertEquals(23,person.getIdade());
    Assertions.assertEquals("RUA",person.getLocalidade().getRua());
    Assertions.assertEquals(1234,person.getLocalidade().getCep());
}


// TODO VALIDANDO RETORNO DE EXCEPTION COM MOKITO
@Test
    void lancarExceptionApiCorreios(){
    Mockito.when(apiCorreios.buscarCep(anyLong())).thenThrow( new IllegalArgumentException("CEP NÂO ENCONTRADO"));
    Assertions.assertThrows( IllegalArgumentException.class, ()-> apiCorreios.buscarCep(anyLong()));
}
    @Test
    void lancarExceptionCadastrarPesso(){
        Mockito.doThrow(IllegalArgumentException.class).when(cadastrarPessoa).cadastrarPessoa(anyString(), anyInt(),anyLong());
        Assertions.assertThrows( IllegalArgumentException.class, ()-> cadastrarPessoa.cadastrarPessoa(anyString(), anyInt(),anyLong()));
    }




}
