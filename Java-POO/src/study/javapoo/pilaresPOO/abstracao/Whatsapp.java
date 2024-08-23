package study.javapoo.pilaresPOO.abstracao;

public class Whatsapp extends ServicoDeMensagem{
    @Override
    public String enviarMensagem() {
        return "WHATSAPP ENVIOU MENSAGEM";
    }

    @Override
    public String receberMensagem() {
        return "WHATSAPP RECEBEU MENSAGEM";
    }
}
