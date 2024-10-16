package study.SpringBoot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import study.SpringBoot.BeansxComponent.Calculadora;

import java.security.PublicKey;

@SpringBootApplication
public class PrimeirosPassosApplication {

	public static void main(String[] args) {SpringApplication.run(PrimeirosPassosApplication.class, args);
	}

	@Bean // TODO ULTILIZO QUNAOD NÂO TENHO ACESOSS AO CODIGO FONT EXEMLOS SERVIÇOS EXTERNOS
	public CommandLineRunner run(Calculadora calculadora)throws Exception {
		return  args -> {
			System.out.println("O valor da soma agora é:" + calculadora.calcular(1,2));
		};
	}


}
