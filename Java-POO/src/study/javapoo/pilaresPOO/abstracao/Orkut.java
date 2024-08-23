package study.javapoo.pilaresPOO.abstracao;

public class Orkut extends  ServicoDeMensagem{
    @Override
    public String enviarMensagem() {
        return "ORKUT ENVIOU MENSAGEM";
    }

    @Override
    public String receberMensagem() {
        return "ORKUT RECEBU MENSAGEM";
    }
}
