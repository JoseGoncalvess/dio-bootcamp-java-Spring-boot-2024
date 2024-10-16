package study.SpringBoot.BeansxComponent;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // TODO ALGUAMS VERSSOES DO SPRING PODE PEDIR ESSA ANOTATION
public class Beans {
    @Bean
    public Calculadora calc (){
        return new Calculadora();
    };
}
