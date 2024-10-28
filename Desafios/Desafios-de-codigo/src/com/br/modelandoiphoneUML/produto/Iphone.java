package com.br.modelandoiphoneUML.produto;

import com.br.modelandoiphoneUML.funcionalidades.Aparelhotelefonico;
import com.br.modelandoiphoneUML.funcionalidades.NavegadorDeInternet;
import com.br.modelandoiphoneUML.funcionalidades.ReprodutorDeMusica;

public class Iphone implements Aparelhotelefonico, NavegadorDeInternet, ReprodutorDeMusica {

   private String modelo;
   private int ano;

    public Iphone(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }




    @Override
    public void atender() {
        System.out.println("ATEDENDO LIGAÇÃO....");

    }

    @Override
    public void ligar(long numero) {
        System.out.println("INICIANDO LIGAÇÃO....");

    }

    @Override
    public void inicarCorreioDeVoz() {
        System.out.println("ICICIANDO CORREIO POR VOZ....");
    }

    @Override
    public void pausar() {
        System.out.println("MUSICA PAUSADA....");
    }

    @Override
    public void tocar() {
        System.out.println("MUSICA INICIADA....");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("MUSICA SELECIONADA....");
        tocar();
    }

    @Override
    public void ExibirPagina() {
        System.out.println("EXIBINDO PAGINA WEB....");
    }

    @Override
    public void AdicionarNovaAba() {
        System.out.println("CARREGANO NOVA ABA....");
    }

    @Override
    public void AtualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA....");
        ExibirPagina();
    }

}
