package com.br.modelandoiphoneUML;

import com.br.modelandoiphoneUML.produto.Iphone;

public class apresnetacao {
    public static void main(String[] args) {
        Iphone myIphone = new Iphone("Iphone 8", 2022);

        myIphone.tocar();

        myIphone.selecionarMusica();

        myIphone.ligar(889916566);

        myIphone.ExibirPagina();

    }
}
