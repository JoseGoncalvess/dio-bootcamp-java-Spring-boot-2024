package org.study;

import java.util.Scanner;

public class Consumo {
    public void calcConsumo(){
        Scanner scanner = new Scanner(System.in);
        double totalCredito = 0.0;
        int n  = Integer.parseInt(scanner.nextLine().trim());
        // Processa múltiplos casos de teste
        for (int i = 0; i < n; i++) {
            String[] dadosLigacao = scanner.nextLine().trim().split(",");
            int duracao = Integer.parseInt(dadosLigacao[0].trim());
            String tipoLigacao = dadosLigacao[1].trim();
            double valorPorMinuto = Double.parseDouble(dadosLigacao[2].trim());

            totalCredito += (duracao * valorPorMinuto);
        }

        // Formata o resultado com duas casas decimais e imprime
        System.out.printf("%.2f%n", totalCredito);
    }
}
