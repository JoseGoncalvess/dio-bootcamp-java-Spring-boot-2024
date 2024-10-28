package org.study.Descontotele;

import java.util.Arrays;

// Classe para representar o combo de serviços
public class ComboServicos {
    private Servico[] servicos;
    private double descontoAdicional = 20.00;

    public ComboServicos(Servico[] servicos) {
        this.servicos = servicos;

    }

    // Método para calcular o valor total do combo com descontos
    public double calcularValorTotal() {
        // Conta quantos serviços foram contratados (com valor maior que 0)

        int servicosContratados = (int) Arrays.stream(servicos)
                .filter(servico -> servico.getValor() > 0)
                .count();

        double desconto = servicos[servicosContratados - 1].getDesconto();
        // TODO: Aplique o desconto correspondente à quantidade de serviços contratados

        double total = Arrays.stream(servicos).filter(servico -> servico.getValor() > 0).mapToDouble(Servico::getValor).sum();

        // Calcula o valor total com desconto
        double valorComDesconto = total - ( total *  (desconto  / 100));

        // TODO: Aplique desconto adicional se todos os três serviços foram contratados

        Arrays.stream(servicos).forEach(servico -> {
            if (servico.getValor() == 0.00) {
            descontoAdicional = 0.00;
            }
        });

        return valorComDesconto - descontoAdicional;
    }
}
