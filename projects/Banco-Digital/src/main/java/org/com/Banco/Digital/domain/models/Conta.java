package org.com.Banco.Digital.domain.models;

import org.com.Banco.Digital.domain.interfaces.Iconta;

public abstract class Conta implements Iconta {
    protected   static  final int AGENCIA_PADRAO = 1;
    protected  static int SEQUENCIA = 1;

    protected   int agencia;
    protected   int numero;
    protected   double saldo;
    protected User user;


    public  Conta(User cliente){
        this.agencia = AGENCIA_PADRAO;
        this.user = cliente;
        this.numero = SEQUENCIA++;
        this.saldo = 0.0;
    }

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void transferir(double valor, Iconta contaDestino) {

    }

    @Override
    public void imprimirExtrato() {

    }
}
