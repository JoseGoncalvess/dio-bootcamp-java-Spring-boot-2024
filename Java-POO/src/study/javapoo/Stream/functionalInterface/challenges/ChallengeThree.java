package study.javapoo.Stream.functionalInterface.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ChallengeThree {
    //Desafio 3 - Verifique se todos os números da lista são positivos:
    //Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, -3, -4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> positive = number -> number > 0;

        numbers.stream().filter(positive).forEach(e -> System.out.println(e +" E um número Positivo!") );


    }
}
