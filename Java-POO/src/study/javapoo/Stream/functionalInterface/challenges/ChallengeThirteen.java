package study.javapoo.Stream.functionalInterface.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ChallengeThirteen {
    // Desafio 13 - Filtrar os números que estão dentro de um intervalo:
    //Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico
    // (por exemplo, entre 5 e 10) e exiba o resultado no console.

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> intervalNumber = number -> (number >= 3 && number <= 5);
        List<Integer> filterIntervalNumber = numbers.stream().filter(intervalNumber).toList();

        System.out.println("A lista intervalada é " + filterIntervalNumber);

    }
}
