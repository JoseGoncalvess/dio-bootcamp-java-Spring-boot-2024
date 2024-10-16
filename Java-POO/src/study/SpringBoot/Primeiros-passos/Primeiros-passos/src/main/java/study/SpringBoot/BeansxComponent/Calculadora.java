package study.SpringBoot.BeansxComponent;

import org.springframework.stereotype.Component;

@Component // TODO ULTIIZO QUANDO TENHO ACESSO AO CODIGO
public class Calculadora {

    public Integer calcular(int number1, int number2){
        return number1 + number2 ;
    }
}
