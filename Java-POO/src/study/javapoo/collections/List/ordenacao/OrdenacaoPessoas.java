package study.javapoo.collections.List.ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    List<Pessoa> grupoPessoas;

   public OrdenacaoPessoas(){
        this.grupoPessoas = new ArrayList<>();
    }

public  void  adicionarPessoa(String nome, int idade, double altura){
       grupoPessoas.add(new Pessoa(nome, idade, altura));
}

public List<Pessoa> ordenarPorIdade(){
       List<Pessoa> pessoasPorIdade = new ArrayList<>(grupoPessoas);
        Collections.sort(pessoasPorIdade);
    return pessoasPorIdade;
}
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(grupoPessoas);
        Collections.sort(pessoasPorAltura,new  comparandoPorAltura());
        return pessoasPorAltura;
    }

}
