package org.studyTest.classsMocks;

public class ApiCorreios {
    public Endereco buscarCep(long cep){
        return  new Endereco("RUA", cep, 13);

    }
}
