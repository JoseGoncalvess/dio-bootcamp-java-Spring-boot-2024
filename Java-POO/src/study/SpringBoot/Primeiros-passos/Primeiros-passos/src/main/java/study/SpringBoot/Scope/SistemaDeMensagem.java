package study.SpringBoot.Scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaDeMensagem {
    @Autowired
    private Rementente noreplay;
    @Autowired
    private  Rementente techTeam;

    public void mensagemDeConfirmacaoCadastro(){
        System.out.println(noreplay);
        System.out.println("Seu cadastro foi Comfirmado");

    }
    public void mensagemDeBoasVindas(){
        techTeam.setEmail("tech@tech.com");
        System.out.println();
        System.out.println("Bem vindo ao Tech Elite");

    }
}
