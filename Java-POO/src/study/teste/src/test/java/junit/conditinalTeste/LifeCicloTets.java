package junit.conditinalTeste;

import org.junit.jupiter.api.*;
import org.studyTest.classJunit.BacoDeDados;

public class LifeCicloTets {


    // ANTES DE TUDO SER FEITO  ISSO
    @BeforeAll
   static void iniciarConecxao(){
        BacoDeDados.initializeConection();

    }

    // ANTESDE CDA TESTE SERA FEITO
    @BeforeEach
    void inserirDados(){
        BacoDeDados.inserioDados();
    }

    // APOS CADA TESTE SERÁ FEITO
    @BeforeEach
    void removerDados(){
        BacoDeDados.removeuDados();
    }

    @Test
    void isTrue(){
        Assertions.assertTrue(true);
    }



    // DEPOIS DE TUDO SERA FEITO ISSO
    @AfterAll
    static void finalizarConecxao(){
        BacoDeDados.finishiConection();

    }

}
