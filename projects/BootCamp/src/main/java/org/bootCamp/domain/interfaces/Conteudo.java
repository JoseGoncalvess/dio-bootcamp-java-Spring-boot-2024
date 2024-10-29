package org.bootCamp.domain.interfaces;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    private String Titulo;
    private String descricao;

    public abstract double calcularXp();

    public static double getXpPadrao() {
        return XP_PADRAO;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
