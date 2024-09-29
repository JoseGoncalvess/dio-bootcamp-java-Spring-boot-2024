package study.javapoo.Stream.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperationExample {
    // REPRESENTA UMA OPERAÇÂO QEU COMBINA DOIS ARGS<T> E RETORNA UMA RESULT<T>
    // ULTILIZADO PAR AOPERAÇÂO D EPARES COMO SOMAR NUMEROS OU COMBINAR OBJETOS
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);


        //CRIANDO UM BINARYOERATOR
        BinaryOperator<Integer> somar = (number1, number2) -> number1 + number2;

       int result =  numbers.stream().reduce(0,somar);
        System.out.println("A soma dos Numeros é ->"+result);
    }
}
