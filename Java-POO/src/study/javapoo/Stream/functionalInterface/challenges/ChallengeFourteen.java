package study.javapoo.Stream.functionalInterface.challenges;

import study.javapoo.Stream.functionalInterface.challenges.Coparetors.ComparatorOrders;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ChallengeFourteen {
    // Desafio 14 - Encontre o maior número primo da lista:
    //Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Predicate<Integer> impares = number -> number % 2 != 0;

        List<Integer> numberImpares = numbers.stream().filter(impares).toList();


        List<Integer> imparesFilters = numberImpares.stream().sorted(new ComparatorOrders()).collect(Collectors.toList());
        System.out.println(imparesFilters);
        int resullt = imparesFilters.get((imparesFilters.size() -2));

        System.out.println("O segundo maior numeor Impar é " + resullt);

    }
}
