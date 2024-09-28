package study.javapoo.Stream.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class fuctionExample {
    // UMA FUNÇÂO QUE RECEBE UM ARGUMENTO DO TIPO T e RETORNA UMA RESULTADO DO TIPO R
    // USANDO COMUMENTE PARA MAPEAR OU TRASNFORAR OS ELEMNTOS DO STREAM EM VALORES D ETIPOS
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Function<Integer, Integer> oDobro = n -> n * 2;

        List<Integer> numerosDobrados = numbers.stream().map(oDobro).toList();
        System.out.println(numerosDobrados);
    }
}
