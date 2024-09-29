package study.javapoo.Stream.functionalInterface;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    //E UMA FUNCTION QUE ACEITA UM ELENTO <T> E RETONA UM BOLLEAN
    //COMUNETA USADO APRA FILTAR ELEMNETOS E UM STREAM BASEADO EM UMA CONDIÇÃO
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java","Dart","Python","Kotlin","JavaScript","SQL");

        //CRIANDO UM PREDICATE
        Predicate<String> maisDeCincoChar =  word -> word. length() > 5;

        // APLICNAOD O PREDICATE AOS STREAM
        words.stream().filter(maisDeCincoChar).forEach(w -> System.out.println("A palavra: "+w+ " Possui mais de 5 Caracteres") );


    }

}
