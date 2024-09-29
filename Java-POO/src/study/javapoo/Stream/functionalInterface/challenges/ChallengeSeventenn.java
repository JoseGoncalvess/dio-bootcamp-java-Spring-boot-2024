package study.javapoo.Stream.functionalInterface.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ChallengeSeventenn {
    //Desafio 17 - Filtrar os números primos da lista:
    //Com a ajuda da Stream API, filtre os números primos da lista
    // e exiba o resultado no console.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Predicate<Integer> numberPrimo = n -> ((n > 1 && n % 2 != 0));

        List<Integer> groupPrimo = numbers.stream().filter(numberPrimo).toList();
        System.out.println("OS numeor sPrimos são "+ groupPrimo);


    }
}
