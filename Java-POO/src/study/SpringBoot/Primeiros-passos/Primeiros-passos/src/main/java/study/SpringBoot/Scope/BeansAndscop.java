package study.SpringBoot.Scope;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class BeansAndscop {

        public static void main(String[] args) {
            SpringApplication.run(study.SpringBoot.Scope.BeansAndscop.class, args);
        }
        @Bean
        public CommandLineRunner run(SistemaDeMensagem sitema)throws Exception {
            return  args -> {
                sitema.mensagemDeConfirmacaoCadastro();
                sitema.mensagemDeBoasVindas();
                sitema.mensagemDeConfirmacaoCadastro();
            };
        }



    }


