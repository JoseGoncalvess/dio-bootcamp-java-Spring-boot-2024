package junit.conditinalTeste.sequenceTest;

import org.junit.jupiter.api.*;

// CONSIDERA O NOME DADO A CADA FUNÇÃO
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class OrdenarSequenceOfTesteDisplayName {
    @DisplayName("A")
    @Test
    void validaFluxoA(){}
    @DisplayName("B")
    @Test
    void validaFluxoB(){}

    @DisplayName("C")
    @Test
    void validaFluxoC(){}

    @DisplayName("D")
    @Test
    void validaFluxoD(){}

}
