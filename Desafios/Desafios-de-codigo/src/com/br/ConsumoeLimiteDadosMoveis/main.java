package com.br.ConsumoeLimiteDadosMoveis;
import java.io.*;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        ClaroSuporte Claro  = new ClaroSuporte();
        Scanner scanner = new Scanner(System.in);

        // TODO CASO 2

        // Solicitando ao usuário o limite mensal de dados em GB
        double limiteGb = scanner.nextDouble();
        scanner.nextLine();  // Consumir a nova linha

        // Solicitando ao usuário o consumo total de dados em MB
        int consumoTotalMb = scanner.nextInt();

        // Verificando o limite de dados móveis
        Claro.verificarLimiteDeDados(limiteGb, consumoTotalMb);

        //==============================================================//


        // TODO CASO 1
        // Solicitando ao usuário a lista de consumos semanais em MB
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] consumoSemanal = input.replaceAll(" ","").split(",");

        // Calculando o consumo total de dados móveis no mês
        int totalConsumo = Claro.calcularConsumoTotal(consumoSemanal);

        // Calculando a média semanal de consumo de dados móveis
        int mediaSemanal = Claro.calcularMediaSemanal(totalConsumo, consumoSemanal.length);

        // Identificando a semana de maior consumo
        int semanaDeMaiorConsumo = Claro.identificarSemanaDeMaiorConsumo(consumoSemanal);

        // Exibindo o consumo total de dados móveis no mês
        System.out.println("Total mensal: " + totalConsumo + " MB");

        // Exibindo a média semanal de consumo
        System.out.println("Media semanal: " + mediaSemanal + " MB");

        // Exibindo a semana de maior consumo
        System.out.println("Maior consumo: Semana " + semanaDeMaiorConsumo);



        scanner.close();

    }
    }


