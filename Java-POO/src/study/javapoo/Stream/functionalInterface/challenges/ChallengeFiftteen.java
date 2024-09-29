package study.javapoo.Stream.functionalInterface.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ChallengeFiftteen {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> negative = number -> number < 0;
        List<Integer> negativeNumber = numbers.stream().filter(negative).toList();

        if (!negativeNumber.isEmpty()){
            System.out.println("Essesão os numeros negativos " + negativeNumber);
        }else {
            System.out.println("A lista não possui numeros negativos");
        }

    }
}
