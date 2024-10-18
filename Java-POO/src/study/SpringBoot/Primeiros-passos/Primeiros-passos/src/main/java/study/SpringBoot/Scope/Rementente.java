package study.SpringBoot.Scope;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Rementente {

    @Override
    public String toString() {
        return "Rementente{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    private  String nome;
    private  String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
