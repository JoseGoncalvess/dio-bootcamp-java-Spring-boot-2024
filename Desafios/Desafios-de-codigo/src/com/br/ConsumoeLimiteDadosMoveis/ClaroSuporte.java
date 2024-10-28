package com.br.ConsumoeLimiteDadosMoveis;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class ClaroSuporte {


    // Função para calcular o consumo total de dados móveis
    public  int calcularConsumoTotal(String[] consumoSemanal) {

        List<Integer> listnumber =new ArrayList<>();
        for (String number : consumoSemanal){
            listnumber.add(number.isEmpty()?0: Integer.valueOf(number));
        }

        BinaryOperator<Integer> soma = (v1, v2) -> v1 + v2;
        int total = listnumber.stream().reduce(0,soma);

        return total;
    }

    // Função para calcular a média semanal de consumo de dados móveis
    public  int calcularMediaSemanal(int totalConsumo, int numeroDeSemanas) {
        return totalConsumo /  numeroDeSemanas;
    }

    // Função para identificar a semana de maior consumo
    public  int identificarSemanaDeMaiorConsumo(String[] consumoSemanal) {
        int semanaDeMaiorConsumo = 0;
        int maiorConsumo = 0;

        List<Integer> listnumber =new ArrayList<>();
        for (String number : consumoSemanal){
            listnumber.add(number.isEmpty()?0: Integer.valueOf(number));
        }

        for (int number : listnumber){
             maiorConsumo = (number >= maiorConsumo)?number : maiorConsumo;
        }

        semanaDeMaiorConsumo = listnumber.indexOf(maiorConsumo) + 1;

        return semanaDeMaiorConsumo;
    }

    private  int gbParaMb(double gb) {
        // TODO: Faça o calculo de conversão GB para MB, sabendo que 1 GB = 1024 MB
        double ress = gb * 1024;
        return Double.valueOf(ress).intValue();
    }

    // Função principal para verificar o limite de dados móveis
    public  void verificarLimiteDeDados(double limiteGb, int consumoTotalMb) {
        // Convertendo o limite de GB para MB
        int limiteMb = gbParaMb(limiteGb);

        // TODO: Verifique se o consumo total excede o limite mensal em MB
        if (consumoTotalMb >= limiteMb) {
            System.out.println("Limite de dados excedido. Compre ou renove seu pacote.");
        } else {
            int dadosDisponiveis = limiteMb - consumoTotalMb;
            System.out.println("Voce ainda possui " + dadosDisponiveis + " MB disponiveis.");
        }
    }

}
