package study.javapoo.collections.Set.PesquisaSet;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
  private  Set<Contato> lisntaTelefonica;
  public AgendaContatos(){
      this.lisntaTelefonica = new HashSet<>();
  }

    public void adicionarContato(String nome, int numero){
        lisntaTelefonica.add(new Contato(nome, numero));
    }
  public  void exibirContatos(){
      lisntaTelefonica.forEach(System.out::println);
  }

  public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> lisntaTelNome = new HashSet<>();
      if (!lisntaTelefonica.isEmpty()) {
          for (Contato c : lisntaTelefonica){
              if (c.getNome().startsWith(nome)){
                  lisntaTelNome.add(c);
                  break;
              }
          }
      }
      return  lisntaTelNome;
  }


  public Contato  atualizarNumeroContato(String nome, int novoNumero){
      Contato contatoAtualizado = null;
      if (!lisntaTelefonica.isEmpty()) {
          for (Contato c : lisntaTelefonica){
              if (c.getNome().equalsIgnoreCase( nome)){
                  c.setNumero(novoNumero);
                  contatoAtualizado = c;
                  break;
              }
          }
      }
      return  contatoAtualizado;

  }



}
