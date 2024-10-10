package org.studyTest.classsMocks;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;
import java.util.stream.Collectors;

public class GeradorNumberAleatorio {
    private static  SplittableRandom ramdom = new SplittableRandom();

    private  GeradorNumberAleatorio(){}

    public  static List<Integer> gerarNumerosAleatorios(int tamanholist){
        return ramdom.ints().boxed().limit(tamanholist).collect(Collectors.toList());
    }

    public  static List<Integer> gerarNumerosAleatoriosof(){
        return  ramdom.ints().boxed().limit(10).collect(Collectors.toList());
    }
}
