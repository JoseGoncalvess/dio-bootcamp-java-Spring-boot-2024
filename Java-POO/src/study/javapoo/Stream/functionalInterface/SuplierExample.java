package study.javapoo.Stream.functionalInterface;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;


// REPRESENTA UAM OPERAÇÂO DO TIPO T E RETORNA UM RESULTADO DO TIPO T
public class SuplierExample {
    public static void main(String[] args) {
        Supplier<String> apresentation = ()-> "Olá, Mechamo Gonçalves!";

        List<String>listasaudacoes = Stream.generate(apresentation).limit(100).collect(Collectors.toList());

        listasaudacoes.forEach(ap -> System.out.println(ap));

    }
}
