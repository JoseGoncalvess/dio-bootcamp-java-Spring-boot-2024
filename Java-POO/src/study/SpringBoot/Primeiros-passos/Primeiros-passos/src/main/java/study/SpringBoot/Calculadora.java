package study.SpringBoot;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {

    public Integer calcular(int number1, int number2){
        return number1 + number2 ;
    }
}
