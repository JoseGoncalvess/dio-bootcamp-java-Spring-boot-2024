package org.studyTest.classsMocks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EnviarMensagem {
    private  List<Mensagem> inbox = new ArrayList<>();
    public List<Mensagem> getInbox() {
        return Collections.unmodifiableList(this.inbox);
    }

    public void  EnviarMensagem(Mensagem mensagem){
        this.inbox.add(mensagem);
        avisarRemetente();
        avisarEmissor();
    }

    public String avisarEmissor() {
        return  "A SUA MENSAGEM FOI ENVIADA";
    }
    public String avisarRemetente() {
        return  "VOCÊ TEM UMA NOVA MENSAGEM";
    }
}
