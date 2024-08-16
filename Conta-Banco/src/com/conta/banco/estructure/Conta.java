package com.conta.banco.estructure;

import java.util.Scanner;

public class Conta {
    private Scanner input =new Scanner(System.in);
    int numero;
    String agencia;
    Cliente clinte;

    float saldo = 0;

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }
    public String getName() {
        return clinte.getName();
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public  Conta(){
        Cliente user = new Cliente("",0);
        System.out.println("Olá, seja bem vindo, vamos iniciar seu cadastro aqui no banco My Money!");
        System.out.println("Primeiro, vamos prencher algumas infomações importantes");
        this.clinte = user.cadastroUser();
        System.out.println();
        System.out.println("Vamos agora cadastrar uma conta para você " + clinte.getName());
        System.out.println("Informe o número da conta com [ 4 DIGITOS] :");
        this.numero = input.nextInt();
        System.out.println("Informe a agencia: \n ex: instituição-localidade [689-8]?");
        this.agencia = input.next();
    }
}
