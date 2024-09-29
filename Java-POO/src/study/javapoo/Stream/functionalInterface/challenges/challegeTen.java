package study.javapoo.Stream.functionalInterface.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class challegeTen {

    // - Agrupe os valores ímpares múltiplos de 3 ou de 5:
    //Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> multiploThreeandFive = n -> ((n % 3 == 0 || n % 3 == 3) || (n % 5 == 0 || n % 5 == 5));

        List<Integer> groupMultiplos = numbers.stream().filter(multiploThreeandFive).collect(Collectors.toList());
        System.out.println("Essa é Lista com os Multiplos "+ groupMultiplos);
    }

}
