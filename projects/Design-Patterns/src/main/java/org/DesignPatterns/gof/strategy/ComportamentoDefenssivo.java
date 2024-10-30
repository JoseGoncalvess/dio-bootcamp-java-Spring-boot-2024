package org.DesignPatterns.strategy;

public class ComportamentoDefenssivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Movendo Defenssivlmente");
    }
}
