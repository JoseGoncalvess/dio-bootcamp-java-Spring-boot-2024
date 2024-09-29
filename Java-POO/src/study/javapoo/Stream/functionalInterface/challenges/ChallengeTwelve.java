package study.javapoo.Stream.functionalInterface.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ChallengeTwelve {
    // Desafio 12 - Encontre o produto de todos os números da lista:
    //Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        BinaryOperator<Integer> fatorrationNumbers = (number1, number2) -> number1 * number2;

        int resullt = numbers.stream().reduce(numbers.get(0),fatorrationNumbers);
        System.out.println("O produto dos numeros d alista é "+ resullt);

    }
}
