package study.javapoo.Stream.functionalInterface.challenges;

import java.util.Arrays;
import java.util.List;

public class ChallengeEigthtenn {
    // Desafio 18 - Verifique se todos os números da lista são iguais:
    //Utilizando a Stream API, verifique se todos os números da lista são
    // iguais e exiba o resultado no console.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> distintos =  numbers.stream().distinct().toList();

        if (distintos.isEmpty()){
            System.out.println("Todos os elemnetos da lista são iguais");
        }{
            System.out.println("Alguns elementos da lista não são iguais " + distintos);
        }
    }
}
