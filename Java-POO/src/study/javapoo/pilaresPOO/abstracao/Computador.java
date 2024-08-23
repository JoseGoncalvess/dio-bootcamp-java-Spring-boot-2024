package study.javapoo.pilaresPOO.abstracao;

public class Computador {
    public static void main(String[] args) {
        Facebook facebook = new Facebook();
        Whatsapp whatsapp = new Whatsapp();
        Orkut orkut = new Orkut();

        facebook.enviarMensagem();
        orkut.enviarMensagem();
        whatsapp.receberMensagem();

    }
}
