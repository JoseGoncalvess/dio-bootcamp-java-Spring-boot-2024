package junit.conditinalTeste.sequenceTest;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.Random.class)
public class OrdenarSequenceOfTesteRadom {
    @Test
    void validaFluxoA(){}
   
    @Test
    void validaFluxoB(){}
   
    @Test
    void validaFluxoC(){}
    
    @Test
    void validaFluxoD(){}

}
