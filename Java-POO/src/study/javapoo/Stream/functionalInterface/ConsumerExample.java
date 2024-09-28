package study.javapoo.Stream.functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// E UMA FUNCTION QU RECEBE UM ELEMNETO QUALQUER <T> EFETUA UMA AÇÂO SOBRE ELE A MAS NÂO RETORNA NADA
// COMUMENTE USAOD PARA INTERAÇÕES SOBRE O ESTREAM SEM ALTERA A ESTRUTURA OU RETORNA ALGUMA VALOR
public class ConsumerExample {
    public static void main(String[] args) {
        //LISTA DE NUMBERS
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //CONSUMER NA PRATICA
        Consumer<Integer> numberPar = numero -> {
            if (numero %  2 == 0){
                System.out.println(numero);
            }
        };

        //IMPLEMENTAÇÃO DO CONSUMER
        numbers.stream().forEach(numberPar);

    }
}
