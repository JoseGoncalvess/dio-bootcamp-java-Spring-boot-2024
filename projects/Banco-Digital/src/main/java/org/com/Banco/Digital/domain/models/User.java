package org.com.Banco.Digital.domain.models;

public class User {
    private String  name;

    private  String cpf;

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getCpf() {
        return cpf;
    }

    public void setCpf(java.lang.String cpf) {
        this.cpf = cpf;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "User{" +
                "name=" + name +
                ", cpf=" + cpf +
                '}';
    }
}
