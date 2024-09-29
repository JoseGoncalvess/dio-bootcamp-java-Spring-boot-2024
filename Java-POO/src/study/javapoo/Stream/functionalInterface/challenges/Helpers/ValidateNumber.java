package study.javapoo.Stream.functionalInterface.challenges.Helpers;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class ValidateNumber {
    public boolean  verificNumberThree(int number){
        if (number < 10) {
           if (number % 3 == 0){
               return  true;
           }else {
               return false;
           }
        }else {
            Function<String, Integer> inter = n -> Integer.valueOf(n);
            BinaryOperator<Integer> somaTotal = (n1,n2) -> n1 + n2;
            List<Integer> numerCompost = Arrays.stream(Integer.toString(number).split("")).map(inter).toList();
            int sum  = numerCompost.stream().reduce(0,somaTotal);
            if (sum % 3 == 0) {
                return  true;
            }else {
                return  false;
            }

        }

    }
    public boolean  verificNumberFive(Integer number){
        if (number.equals(5) || number.equals(10)) {
            return true;
        }else {
            Function<String, Integer> inter = n -> Integer.valueOf(n);
            BinaryOperator<Integer> somaTotal = (n1,n2) -> n1 + n2;
            List<Integer> numerCompost = Arrays.stream(Integer.toString(number).split("")).map(inter).toList();
            if (numerCompost.getLast() == 0 || numerCompost.getLast() == 5){
                return  true;
            }else {
                return false;
            }


        }

    }

}
