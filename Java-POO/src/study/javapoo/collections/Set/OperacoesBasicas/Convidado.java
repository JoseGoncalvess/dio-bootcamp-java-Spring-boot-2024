package study.javapoo.collections.Set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    private  String nome;
    private int numberConvite;

   public Convidado(String nome, int convite){
       this.nome =nome;
       this.numberConvite = convite;
   }

    public int getNumberConvite() {
        return numberConvite;
    }

    public void setNumberConvite(int numberConvite) {
        this.numberConvite = numberConvite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getNumberConvite() == convidado.getNumberConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumberConvite());
    }
}
