package study.javapoo.pilaresPOO.abstracao;

public class Facebook extends ServicoDeMensagem {
    @Override
    public String enviarMensagem() {
        return "FACEBOOK ENVIOU MENSSAGEM";
    }

    @Override
    public String receberMensagem() {
        return "FACEBOOK RECEBEU MENSSAGEM";
    }
}
