package study.javapoo.Stream.functionalInterface.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ChallengeTwoo {
    // Desafio 2 - Imprima a soma dos números pares da lista:
    //Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> pares = number -> number % 2 ==0;

        numbers.stream().filter(pares).forEach(e -> System.out.println(e +" E um número Par!") );


    }
}
