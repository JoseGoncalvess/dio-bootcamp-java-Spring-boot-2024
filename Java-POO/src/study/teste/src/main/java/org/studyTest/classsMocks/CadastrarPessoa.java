package org.studyTest.classsMocks;

import org.studyTest.classJunit.Pessoa;

public class CadastrarPessoa {
    private  ApiCorreios apiCorreios;
   public CadastrarPessoa(ApiCorreios apicorreios){
        this.apiCorreios = apicorreios;
    }

    public Pessoa cadastrarPessoa(String nome, int idade, long cep){
       Endereco  endereco = apiCorreios.buscarCep(cep);
        Pessoa newPessoa = new Pessoa(nome, idade, endereco);
       return newPessoa;
    }


}
