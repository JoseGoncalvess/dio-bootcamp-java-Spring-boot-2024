package study.javapoo.collections.List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {
    List<Tarefa> tarefas;

  public ListaDeTarefas(){
       this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
      Tarefa newtarefa = new Tarefa(tarefas.size(),descricao);
      tarefas.add(newtarefa);
    }

   public void  removerTarefa(int identificador){
      tarefas.remove(identificador);
   }

  public int  obterNumeroTotalTarefas(){
      return tarefas.size();
  }

public void obterDescricoesTarefas(){tarefas.forEach(tarefa -> System.out.println("Tarefa Nº"+tarefa.getId()+" Descrição: "+tarefa.getDescricao()));
};

}
