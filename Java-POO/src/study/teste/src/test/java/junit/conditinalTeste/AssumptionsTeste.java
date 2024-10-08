package junit.conditinalTeste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;


public class AssumptionsTeste {

    // OLHA PAR AVALIDAÇÃO AO EXECULTAR O TESTE
    @Test
    void vlaidarsomenteSeUserByComputerActual(){
        Assumptions.assumeTrue("conta".equals(System.getenv("USERNAME")));
        Assertions.assertTrue(true);
    }


}
