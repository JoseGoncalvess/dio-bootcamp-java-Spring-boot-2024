package study.javapoo.pilaresPOO.polimorfismo;

import study.javapoo.pilaresPOO.abstracao.Facebook;
import study.javapoo.pilaresPOO.abstracao.Orkut;
import study.javapoo.pilaresPOO.abstracao.Whatsapp;

public class Aplicativoselecionado {
    public static void main(String[] args) {
        String aplicativo = "Face";
        setAplicativo(aplicativo);


    }
    public static void setAplicativo(String aplicativo) {
        if (aplicativo.equals("Facebook")) {
            Facebook app = new  Facebook();
            app.enviarMensagem();

        } else if (aplicativo.equals("Orkut")){
            Orkut app = new Orkut();
            app.enviarMensagem();
        }

        else if (aplicativo.equals("Whatsapp")) {
            Whatsapp app = new Whatsapp();
            app.enviarMensagem();
        }
    }
}

