package src.br.com.alura.exercicio.classes;

public class Livro {
    private String titulo;
    private String autor;

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

    public void exibirDetalhes(){
        System.out.println("Titulo do livro: " +getTitulo());
        System.out.println("Titulo do livro: " +getAutor());
    }
}
