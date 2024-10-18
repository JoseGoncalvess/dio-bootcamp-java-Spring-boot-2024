package study.SpringBoot.PropertiesValue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import study.SpringBoot.Scope.Rementente;

import java.util.List;

@Component
public class SistemaDeMensagem implements CommandLineRunner {
@Autowired
    private  Remete remetente;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("MEssagem enviada por: "+ remetente.getName() +"\nE-mail: "+remetente.getEmail()+ "\n Telefones para Contato:" + remetente.getPhones());
        System.out.println("Cadastro Realizado com Sucesso!");
    }
}
