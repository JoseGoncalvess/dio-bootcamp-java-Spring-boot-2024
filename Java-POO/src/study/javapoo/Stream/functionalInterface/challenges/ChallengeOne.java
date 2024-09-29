package study.javapoo.Stream.functionalInterface.challenges;

import study.javapoo.Stream.functionalInterface.challenges.Coparetors.ComparatorOrders;

import java.util.Arrays;
import java.util.List;

public class ChallengeOne {
    //Desafio 1 - Mostre a lista na ordem numérica:
    //Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numbers.stream().sorted(new ComparatorOrders()).forEach(e -> System.out.println(e));
    }
}
