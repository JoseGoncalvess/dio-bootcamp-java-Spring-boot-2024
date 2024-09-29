package study.javapoo.Stream.functionalInterface.challenges;

import study.javapoo.Stream.functionalInterface.challenges.Helpers.ValidateNumber;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ChallengeNineteen {
    //Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:
    //Com a Stream API, encontre a soma dos números da lista que são
    // divisíveis tanto por 3 quanto por 5 e exiba o resultado no console.


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 15);
        ValidateNumber val = new ValidateNumber();

        Predicate<Integer> divisorThreeandFive = n -> (val.verificNumberThree(n)) && (val.verificNumberFive(n));

        List<Integer> groupMultiplos = numbers.stream().filter(divisorThreeandFive).collect(Collectors.toList());

        System.out.println(groupMultiplos);

    }

}
