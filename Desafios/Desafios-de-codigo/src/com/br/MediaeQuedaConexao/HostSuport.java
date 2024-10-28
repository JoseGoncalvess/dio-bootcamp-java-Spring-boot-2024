package com.br.MediaeQuedaConexao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class HostSuport {


    // Função para calcular a velocidade média de conexão de internet
    public static double calcularVelocidadeMedia(String[] velocidades) {
        List<Integer> listnumber =new ArrayList<>();
      for (String number : velocidades){
          listnumber.add(number.isEmpty()?0: Integer.valueOf(number));
      }

        BinaryOperator<Integer> soma = (v1, v2) -> v1 + v2;
        int total = listnumber.stream().reduce(0,soma);

        return total / listnumber.size();
    }
    public static String verificarQuedaConexao(String[] velocidades) {
        List<Integer> listnumber =new ArrayList<>();
        for (String number : velocidades){
            listnumber.add(number.isEmpty()?0: Integer.valueOf(number));
        }


        return listnumber.contains(0)?"Queda de Conexao":"Sem Quedas";
    }
;}
