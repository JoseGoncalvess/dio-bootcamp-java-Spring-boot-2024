package junit.conditinalTeste.sequenceTest;

import org.junit.jupiter.api.*;
// RESPEIDA A ORDEM DEFINIDA PARA CADA TESTE
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrdenarSequenceOfTeste {
    @Order(4)
    @Test
    void validaFluxoA(){}
    @Order(1)
    @Test
    void validaFluxoB(){}

    @Order(3)
    @Test
    void validaFluxoC(){}

    @Order(2)

    @Test
    void validaFluxoD(){}

}

