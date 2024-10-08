package junit.conditinalTeste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.studyTest.Pessoa;

public class PessoaTest {
    @Test
    void validarSaudacao(){
        Pessoa person = new Pessoa("Anny", 23);
        Assertions.assertEquals("Olá me chamo Anny", person.saudacao());
    }
    @Test
    void validarIdade(){
        Pessoa person = new Pessoa("Anny", 23);
        Assertions.assertEquals(23, person.getIdade());
    }

    @Test
    void verificarMenorIdade(){
        Pessoa person = new Pessoa("Maria", 15);
        Assertions.assertEquals(false,
                person.maiordeIdade());
    }
    @Test
    void verificarMaiorIdade(){
        Pessoa person = new Pessoa("Geovana", 24);
        Assertions.assertEquals(true,
                person.maiordeIdade());
    }
}
