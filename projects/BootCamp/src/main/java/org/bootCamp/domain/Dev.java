package org.bootCamp.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.bootCamp.domain.interfaces.Conteudo;

public class Dev {

    private String nome;
    private List<Conteudo> conteudoscadastrados = new ArrayList<>();
    private List<Conteudo> conteudosfinalizados = new ArrayList<>();

    public Dev(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conteudo> getConteudoscadastrados() {
        return conteudoscadastrados;
    }

    public void setConteudoscadastrados(List<Conteudo> conteudoscadastrados) {
        this.conteudoscadastrados = conteudoscadastrados;
    }

    public List<Conteudo> getConteudosfinalizados() {
        return conteudosfinalizados;
    }

    public void setConteudosfinalizados(List<Conteudo> conteudosfinalizados) {
        this.conteudosfinalizados = conteudosfinalizados;
    }

    public void inscreverBootcamp(BootCamp bootCamp) {
        this.conteudoscadastrados.addAll(bootCamp.getConteudos());
        bootCamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudoscadastrados.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosfinalizados.add(conteudo.get());
            this.conteudoscadastrados.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calcularTotalXp() {

        return this.conteudosfinalizados
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();

    }

}
