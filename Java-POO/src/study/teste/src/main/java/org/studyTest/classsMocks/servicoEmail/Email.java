package org.studyTest.classsMocks.servicoEmail;

public class Email {
    private String destinatario;
    private String msg;

    public Email(String destinatario, String msg){
        this.msg = msg;
        this.destinatario = destinatario;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String paraquem) {
        this.destinatario = paraquem;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }



}
