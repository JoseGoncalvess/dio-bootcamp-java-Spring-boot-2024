package study.javapoo.Stream.functionalInterface.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class ChallengerEleven {
    // Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
    //Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Function<Integer, Integer> oQuadrdo = n -> n * n;
        BinaryOperator<Integer> sumQuadradic = (number1, number2) -> number1 + number2;


        List<Integer> numberOfQuadradic = numbers.stream().map(oQuadrdo).toList();
        int result = numberOfQuadradic.stream().reduce(0, sumQuadradic);
        System.out.println("A soma do quadrado detodos os numero é "+result);

    }
}
