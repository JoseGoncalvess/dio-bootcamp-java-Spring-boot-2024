package com.br.contratacaocombo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de serviços contratados
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] servicosContratados = input.split(",");

        // Verificando se o cliente contratou um combo completo
        verificarComboCompleto service =  new verificarComboCompleto();
        service.statuscomboold(servicosContratados);
        service.statuscombo(servicosContratados);

    }
}
