package study.javapoo.collections.Map.Pesquisa;

import java.util.Map;
import java.util.TreeMap;

public class EstoqueProdutos {
    Map<Long, Produto> estoqueProduto;

    public EstoqueProdutos() {
        this.estoqueProduto = new TreeMap<>();
    }
public  void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProduto.put(cod,new Produto(nome,preco,quantidade));
}

public void exibirProdutos(){
       estoqueProduto.forEach((cod, produto) ->
               System.out.println("Cod: "+cod+" Produto: "+produto.getNome()+" Quant: "+ produto.getQuant()+" Preço: "+produto.getPreco()));
}

public void  calcularValorTotalEstoque(){
        double valorTotal = 0;
        for (Produto prod : estoqueProduto.values()){
            valorTotal += (prod.getPreco() * prod.getQuant());
        }

}

public Produto obterProdutoMaisCaro(){
        Produto prodMaisCaro = new Produto("PADRÃO",0.0,0);
        for(Produto prod : estoqueProduto.values()){
            if (prod.getPreco() > prodMaisCaro.getPreco()){
                prodMaisCaro = prod;
            }
        }
        return prodMaisCaro;
}

    public Produto obterProdutoMaisBarato(){
        Produto prodMaisBarato = new Produto("PADRÃO",9999.0,0);
        for(Produto prod : estoqueProduto.values()){
            if (prod.getPreco() < prodMaisBarato.getPreco()){
                prodMaisBarato = prod;
            }
        }
        return prodMaisBarato;
    }

   public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        double maiorQuantidadeValorEstoque = 0.0;
       Produto prodMaiorEstoquevalor = new Produto("PADRÃO",0.0,0);
       if (!estoqueProduto.isEmpty()) {
           for (Produto prod : estoqueProduto.values()){
             double  valorProdutoEstoque = (prod.getPreco() * prod.getQuant());
               if (valorProdutoEstoque > maiorQuantidadeValorEstoque) {
                   maiorQuantidadeValorEstoque = valorProdutoEstoque;
                   prodMaiorEstoquevalor = prod;
               }
           }
       }
      return prodMaiorEstoquevalor;
   }

 }
