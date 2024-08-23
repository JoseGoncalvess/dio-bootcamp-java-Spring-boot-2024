package study.javapoo.visibility;

public class Aluno extends  Pessoa {
    public Aluno(long matricula, String nome) {
        this.matricula = matricula;
        this.nome =nome;
    }

    private  long matricula;
  private String sexo;

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }



    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }
    public long getMatricula() {
        return matricula;
    }
}
