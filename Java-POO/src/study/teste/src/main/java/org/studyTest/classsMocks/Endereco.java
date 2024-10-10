package org.studyTest.classsMocks;

public class Endereco {
    private String rua;
    private int number;
    private long cep;


    public Endereco(String rua, long cep, int number){
        this.cep = cep;
        this.number = number;
        this.rua = rua;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public long getCep() {
        return cep;
    }

    public void setCep(long cep) {
        this.cep = cep;
    }



}
