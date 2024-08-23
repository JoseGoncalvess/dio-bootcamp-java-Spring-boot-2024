package study.javapoo.visibility;

public class Pessoa {
    String nome;
    long idade;

    public long getIdade() {
        return idade;
    }

    public void setIdade(long idade) {
        this.idade = idade;
    }

    public void cumprimento(){
        System.out.println("Olá, me chamo "+ this.nome +" tudo bem?");
    }
}
