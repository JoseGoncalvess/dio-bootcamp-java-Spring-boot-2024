package org.DesignPatterns.strategy;

public class ComportamentoOfenssivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Movendo Ofenssivamente");
    }
}
