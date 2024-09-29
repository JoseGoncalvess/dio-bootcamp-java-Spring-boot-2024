package study.javapoo.Stream.functionalInterface.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ChallengeFive {
    // lcule a média dos números maiores que 5:
    //Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> maiorQueCinco = number -> number > 5;
        BinaryOperator<Integer> somaNumber = (n1, n2) -> n1 +n2;

        List<Integer> numberfiltrador = numbers.stream().filter(maiorQueCinco).collect(Collectors.toList());

       int result =  numberfiltrador.stream().reduce(0,somaNumber) / numberfiltrador.size();
        System.out.println("A media da lsitas d enumeros maiores que 5 é -> "+ result);
    }

}
