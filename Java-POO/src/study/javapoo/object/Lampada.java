package study.javapoo.object;

public class Lampada {
    public Lampada(String color) {
        this.cor = color;
    }

    //Propriedades
    String cor;
    boolean ligada = false;



    // Metodos
    public String getCor() {
        return cor;
    }
    private void setCor(String cor) {
        this.cor = cor;
    }
    public boolean isLigada() {
        return ligada;
    }


    public void ligarLampada(){
        ligada = true;
    }

    public void stateOfLmapada(){
        System.out.println("A lampada está " + isLigada());
    }


}
