package org.studyTest;

import java.util.IllegalFormatException;

public class Conta {

    public static   void tarsnferencia( int value){

        if (value <=0){
            throw new IllegalArgumentException("VALOR INFERIROR A");
        }
    }

}
