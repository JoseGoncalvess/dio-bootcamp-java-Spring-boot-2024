package study.javapoo.construtores;

public class Pessoa {
    private String nome;

    private String endereco;
    private long cpf;
    //CONSTRUTOR PERSSONALIZADOS
    public Pessoa(String nome, long cpf){
        this.cpf = cpf;
        this.nome=nome;
    }
    //CONSTRUTOR PERSSONALIZADOS
    public Pessoa(String nome){
        this.nome=nome;
    }
    //CONSTRUTOR DEFULTH
    public Pessoa(){
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

}