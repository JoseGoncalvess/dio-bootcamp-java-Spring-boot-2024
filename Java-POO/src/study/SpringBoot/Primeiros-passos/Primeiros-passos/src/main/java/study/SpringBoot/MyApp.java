package study.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import study.SpringBoot.BeansxComponent.Calculadora;

@Component
public class MyApp implements CommandLineRunner {
    @Autowired
    private Calculadora calculadora;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("A soma dos números é : "+ calculadora.calcular(10,55));
    }
}
