package junit.conditinalTeste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTeste {

    // CODICIONAO A EXECULÇÂO DO MEU TESTE
    @Test
    @EnabledIfEnvironmentVariable(named = "USERNAME", matches = "conta")
    void vlaidarsomenteSeUserByComputerActual(){
        Assertions.assertTrue(true);
    }

    @Test
    @EnabledOnJre(JRE.JAVA_10)
    void vlaidarsomenteSeJAVAVERSION(){
        Assertions.assertTrue(true);
    }

    @Test
    @EnabledOnOs({OS.WINDOWS, OS.LINUX})
    void vlaidarsomenteSePALTFORMS(){
        Assertions.assertTrue(true);
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.OTHER)
    void vlaidarsomenteSeVERSSIONJAVA(){
        Assertions.assertTrue(true);
    }

}
