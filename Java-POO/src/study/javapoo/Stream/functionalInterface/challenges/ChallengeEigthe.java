package study.javapoo.Stream.functionalInterface.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ChallengeEigthe {
    // Desafio 8 - Somar os dígitos de todos os números da lista:
    //Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        BinaryOperator<Integer> somatudo = (number1, number2) -> number1 + number2;

       int ressult =  numbers.stream().reduce(0,somatudo);
        System.out.println("A soma d todos os numeros da lista é "+ressult);
    }
}
