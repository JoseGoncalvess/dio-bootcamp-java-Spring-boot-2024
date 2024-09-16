package study.javapoo.collections.List.PesquisaLista;

public class Livro {
   private String titulo;
   private String autor;
   private int anopublicacao;


   public Livro( String titulo, String autor,  int anopublicacao){
       this.anopublicacao = anopublicacao;
       this.autor = autor;
       this.titulo = titulo;
   }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnopublicacao() {
        return anopublicacao;
    }

    public void setAnopublicacao(int anopublicacao) {
        this.anopublicacao = anopublicacao;
    }

}
