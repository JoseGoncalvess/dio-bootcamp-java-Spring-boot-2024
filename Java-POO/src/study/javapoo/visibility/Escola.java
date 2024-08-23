package study.javapoo.visibility;

public class Escola {
    public static void main(String[] args) {
        Aluno novato = new  Aluno(123566,"Aline");
        novato.setSexo("Feminino");
        novato.setIdade(24);

        novato.cumprimento();

    }
}
