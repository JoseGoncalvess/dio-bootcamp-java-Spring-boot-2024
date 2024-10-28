package org.study.Descontotele;

// Classe para representar um serviço
public class Servico {
    private double valor;
    private  double desconto;

    public Servico(double valor, double desconto) {
        this.valor = valor;
        this.desconto = desconto;
    }

    public double getValor() {
        return valor;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
