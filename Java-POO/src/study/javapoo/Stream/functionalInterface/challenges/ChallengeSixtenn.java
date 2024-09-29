package study.javapoo.Stream.functionalInterface.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ChallengeSixtenn {
    // Desafio 16 - Agrupe os números em pares e ímpares:
    //Utilize a Stream API para agrupar os números em duas listas separadas,
    // uma contendo os números pares e outra contendo
    // os números ímpares da lista original, e exiba os resultados no console.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Predicate<Integer> pares = number -> number % 2 ==0;
        Predicate<Integer> impares = number -> number % 2 !=0;

        List<Integer> numberPares = numbers.stream().filter(pares).toList();
        List<Integer> numberImpares = numbers.stream().filter(impares).toList();

        System.out.println("Esse são os números pares -> "+numberPares);
        System.out.println("Esse são os números impares -> "+numberImpares);
    }
}
