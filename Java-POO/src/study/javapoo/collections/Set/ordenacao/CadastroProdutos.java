package study.javapoo.collections.Set.ordenacao;

import java.util.*;

public class CadastroProdutos  {
   private Set<Produto> produtos;

   public CadastroProdutos() {
      this.produtos = new HashSet<>();
   }


   public   void adicionarProduto(int cod, String nome, double preco, int quantidade){
      produtos.add(new Produto(nome,cod,preco,quantidade));
   }

   public void exibirProdutosPorNome(){
      Set<Produto> setPorNomeProduto = new TreeSet<Produto>(produtos);
      setPorNomeProduto.forEach(produto -> System.out.println(produto.toString()));
      System.out.println("================================================");

   }
   public  void exibirProdutosPorPreco(){
      Set<Produto> setPorPrecoProduto = new TreeSet<Produto>(new ComparatorPorPreco()); // TRASNFOMRO O SET EM UMA ARRAY LIST PARA IMPLEMENTAR O METODO SORT
      setPorPrecoProduto.addAll(produtos);
      setPorPrecoProduto.forEach(produto ->   System.out.println(produto.toString()));
      System.out.println("================================================");
   }
   public  void exibirProdutosPorCod(){
      List<Produto> setPorPrecoProduto = new ArrayList<>(produtos); // TRASNFOMRO O SET EM UMA ARRAY LIST PARA IMPLEMENTAR O METODO SORT
      Collections.sort(setPorPrecoProduto,new ComparatorPorCod());
      setPorPrecoProduto.forEach(produto ->   System.out.println(produto.toString()));
      System.out.println("================================================");
   }




}