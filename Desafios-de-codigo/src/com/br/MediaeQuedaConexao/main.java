package com.br.MediaeQuedaConexao;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HostSuport GZNET = new HostSuport();

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.replaceAll(" ","").split(",");

        // Calculando a velocidade média de conexão
        double velocidadeMedia = GZNET.calcularVelocidadeMedia(velocidades);
        String quedaConexao = GZNET.verificarQuedaConexao(velocidades);


        // Exibindo a velocidade média de conexão
        System.out.println((int)velocidadeMedia + " Mbps");
        System.out.println(quedaConexao);

        scanner.close();
    }
}
