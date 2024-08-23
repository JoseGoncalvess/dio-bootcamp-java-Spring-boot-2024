package study.javapoo.construtores;

public class SitemaDeCadastro {
    public static void main(String[] args) {
        Pessoa gui = new Pessoa("Gui",23256598);
        gui.setEndereco("ManorlGomes de sá");

        System.out.println(gui.getNome() +" Mora na rua "+ gui.getEndereco());
    }
}
