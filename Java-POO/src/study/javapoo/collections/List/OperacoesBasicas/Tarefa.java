package study.javapoo.collections.List.OperacoesBasicas;

public class Tarefa {
    String descricao;
    int id;

    public Tarefa(int id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

   private  void setId(int id) {
        this.id = id;
    }
}
