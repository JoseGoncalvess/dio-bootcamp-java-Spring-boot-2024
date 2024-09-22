package study.javapoo.collections.Map.OperacoesBasicas;

import study.javapoo.collections.Set.PesquisaSet.Contato;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    Map<String, Integer> listaContatos;

    public AgendaContatos() {
        listaContatos = new HashMap<>();
    }
   public void adicionarContato(String nome, Integer telefone){
       listaContatos.put(nome,telefone);
   }

    public void removerContato(String nome){
       if (!listaContatos.isEmpty()){
           listaContatos.remove(nome);
       }
    }


    public void   exibirContatos(){
        System.out.println(listaContatos);
    }

    public String pesquisarPorNome(String nome){
        String contato = "";
        if (listaContatos.containsKey(nome)) {
            contato = "Contato:"+ nome +" com número: "+ listaContatos.get(nome);
        }
        System.out.println(contato);
        return  contato;
    }

}
