package org.studyTest.classJunit;

import org.studyTest.classsMocks.Endereco;

public class Pessoa {
    private String nome;
    private int idade;

    public Endereco getLocalidade() {
        return localidade;
    }

    public void setLocalidade(Endereco localidade) {
        this.localidade = localidade;
    }

    private Endereco localidade;
    public Pessoa(String nome, int idade, Endereco local){
        this.nome = nome;
        this.idade = idade;
        this.localidade = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public  String saudacao(){
        return "Olá me chamo "+ this.nome ;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public  boolean maiordeIdade(){
      return this.idade > 18 ? true : false;
    }


}
