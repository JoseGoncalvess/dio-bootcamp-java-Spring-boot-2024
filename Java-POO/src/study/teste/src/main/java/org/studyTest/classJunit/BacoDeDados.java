package org.studyTest;

import java.util.logging.Logger;

public class BacoDeDados {
    private  static final Logger LOGGER = Logger.getLogger(BacoDeDados.class.getName());


    public static void initializeConection(){
        LOGGER.info("INICIOU A CONEXÃO");
    }

    public static void finishiConection(){
        LOGGER.info("FINALIZOU A CONEXÃO");

    }
    public static void inserioDados(){
        LOGGER.info("INSERIOU DADOS NO DB");

    }    public static void removeuDados(){
        LOGGER.info("REMOVEU DADOS DO DB");

    }

}
