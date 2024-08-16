package com.conta.banco.estructure;
import java.util.Scanner;

public class Cliente {
    private Scanner input =new Scanner(System.in);

    private String name;
    private long cpf;

    public Cliente(String name, long cpf){
        this.name = name;
        this.cpf = cpf;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cliente cadastroUser(){
        System.out.println("Como você se chama ?");
        String name = input.nextLine();
        System.out.println("Informe seu CPF apenas os numeros ?");
        long cpf = input.nextLong();
        System.out.println("Cadastro de usuario finalizado...");
        System.out.println("Seja bem vido " + name + " ao My Money!");
        return new  Cliente(name, cpf);
    }

}
