package org.studyTest.classsMocks.servicoEmail;

public class ServicoEmail {
    private  Plataforma plataforma;

    public  void enviarEmail(String destinatario, String msg, boolean istxt){
        Email email = null;
        if (!istxt) {
           email = new Email(destinatario,msg);
        }else {
            email = new Email(destinatario,msg);
        }
            plataforma.enviarEmail(email);

    }
}
