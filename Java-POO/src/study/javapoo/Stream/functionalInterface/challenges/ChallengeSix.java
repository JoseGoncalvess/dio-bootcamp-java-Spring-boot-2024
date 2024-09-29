package study.javapoo.Stream.functionalInterface.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ChallengeSix {
    // Desafio 6 - Verificar se a lista contém algum número maior que 10:
    //Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,88, 5, 4, 3);

        Predicate<Integer> maiorQue10 = number -> number > 10;

     List<Integer> numberMaiorQue10 =  numbers.stream().filter(maiorQue10).collect(Collectors.toList());

        if (!numberMaiorQue10.isEmpty()) {
            numberMaiorQue10.stream().forEach(e ->{
                System.out.println("O numero "+e+ " É maior que > 10 e esta presneta na lista");

            } );
        }else {
            System.out.println("A Lista não possui numero maiores qeu 10!");

        }



    }
}
