package junit.conditinalTeste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.studyTest.classJunit.Pessoa;
import org.studyTest.classsMocks.Endereco;

public class PessoaTest {
    @Test
    void validarSaudacao(){
        Pessoa person = new Pessoa("Anny", 23,new Endereco("RUA", 1234, 13));
        Assertions.assertEquals("Olá me chamo Anny", person.saudacao());
    }
    @Test
    void validarIdade(){
        Pessoa person = new Pessoa("Anny", 23,new Endereco("RUA", 1234, 13));
        Assertions.assertEquals(23, person.getIdade());
    }

    @Test
    void verificarMenorIdade(){
        Pessoa person = new Pessoa("Maria", 15,new Endereco("RUA", 1234, 13));
        Assertions.assertEquals(false,
                person.maiordeIdade());
    }
    @Test
    void verificarMaiorIdade(){
        Pessoa person = new Pessoa("Geovana", 24,new Endereco("RUA", 1234, 13));
        Assertions.assertEquals(true,
                person.maiordeIdade());
    }
}
