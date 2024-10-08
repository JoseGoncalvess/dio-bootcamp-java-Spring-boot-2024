package junit.conditinalTeste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.studyTest.Conta;

public class ExceptionsTeste {

    @Test
    void validadteInlegalExecption(){

        Assertions.assertThrows(IllegalArgumentException.class,()-> Conta.tarsnferencia(-1) );

    }
    @Test
    void validadteNotInlegalExecption(){

        Assertions.assertDoesNotThrow( ()-> Conta.tarsnferencia(20) );

    }



}
