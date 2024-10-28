package com.br.explorandoservicetell;
import java.util.Scanner;

public class VerificacaoServico {
    Scanner input = new Scanner(System.in);
    public void  statusservice(){
        System.out.println("Bom Dia, Qual serviço deseja Suport:" +
                "\"movel\", \"fixa\", \"banda larga\", \"tv\")");
        String servico = input.nextLine().trim();

        System.out.println("Agora, informe sue snome e os serviços contratados separados por ',': ex:Maykon,movel,fixa");
        String entradaCliente = input.nextLine().trim();

        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0].isEmpty() ? "" :partes[0];
        boolean contratado = false;

        if (entradaCliente.contains(servico)) {
            contratado = true;
            System.out.println("Sim");
        }else {
            System.out.println("Nao");
        }

    }



}
