package junit.conditinalTeste.sequenceTest;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

// CONSIDER AO NOME DA FUNÇÃO
@TestMethodOrder(MethodOrderer.MethodName.class)
public class OrdenarSequenceOfTestenamed {

    @Test
    void validaFluxoA(){}

    @Test
    void validaFluxoB(){}


    @Test
    void validaFluxoC(){}


    @Test
    void validaFluxoD(){}

}
