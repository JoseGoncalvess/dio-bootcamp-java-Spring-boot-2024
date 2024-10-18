package study.SpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import study.SpringBoot.BeansxComponent.Calculadora;
import study.SpringBoot.Scope.Rementente;

@Configuration // TODO ALGUAMS VERSSOES DO SPRING PODE PEDIR ESSA ANOTATION
public class Beans {
    @Bean
    public Calculadora calc (){
        return new Calculadora();
    };
    @Bean
    @Scope("prototyp") // TODO PERMITE DEFINIR UM CONTEXTO PARA O CONTAINER CRIAR O OBJETO COM REFERENCIA DIRVEGENTES, DIRERENTE DO PADRÂO SINGlETON
                        // TODO ASSSIM ELE MAPEIA QANTAS ESTANCIA VAI PRECISA GERAR PARA SEREM INJETADAS
    public Rementente Rementente(){
        System.out.println("Criando UM REMETENTE");
        Rementente rementente = new Rementente();
        rementente.setEmail("noreplay@tech.com");
        rementente.setNome("Algusto");
        rementente.setNome("Digital tech");
        return rementente;
    }

}
