package study.javapoo.Stream.functionalInterface.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ChallengeFour {
    // Desafio 4 - Remova todos os valores ímpares:
    //Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> primos = number -> number % 2 !=0;

       List<Integer> numberPrimos = numbers.stream().filter(primos).collect(Collectors.toList());
        System.out.println(numberPrimos);

    }

}