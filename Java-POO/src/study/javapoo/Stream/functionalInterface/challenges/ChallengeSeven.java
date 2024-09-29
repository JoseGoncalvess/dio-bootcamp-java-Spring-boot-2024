package study.javapoo.Stream.functionalInterface.challenges;

import study.javapoo.Stream.functionalInterface.challenges.Coparetors.ComparatorOrders;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ChallengeSeven {
    // Desafio 7 - Encontrar o segundo número maior da lista:
    //Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer>  numberFilter = numbers.stream().sorted(new ComparatorOrders()).collect(Collectors.toList());
        int secondNumberTall = numberFilter.get((numberFilter.size() - 2));
        System.out.println(secondNumberTall);


    }
}
