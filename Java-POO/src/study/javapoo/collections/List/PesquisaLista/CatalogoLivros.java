package study.javapoo.collections.List.PesquisaLista;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    List<Livro> biblioteca;

    public void setBiblioteca() {
        this.biblioteca = new ArrayList<>();
    }

   public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        Livro newLivro = new Livro(titulo, autor ,anoPublicacao);
        biblioteca.add(newLivro);
    }

    public   List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livroAutor = new ArrayList<>();
        for(Livro livro : biblioteca){
           if (livro.getAutor().equals(autor)){
               livroAutor.add(livro);
           }
        }
        return livroAutor;
    }

    public  List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livroIntervalo = new ArrayList<>();
        for(Livro livro : biblioteca){
            if (livro.getAnopublicacao() >= anoFinal && livro.getAnopublicacao() <= anoFinal){
                livroIntervalo.add(livro);
            }
        }
        return livroIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroAutor = null;
        if (!biblioteca.isEmpty()){
            for (Livro l : biblioteca){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroAutor = l;
                }}
            }
        return  livro;
        }
    }
}



