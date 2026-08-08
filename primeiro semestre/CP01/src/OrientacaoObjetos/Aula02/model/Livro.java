package OrientacaoObjetos.Aula02.model;

public class Livro {
    //Atributos
    private String titulo;
    private String autor;

    //Getters e Setters
    //Titulo
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //Autor
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    //Métodos
    public void exibirDetalhes(){
        System.out.println("Titulo do Livro: " + getTitulo());
        System.out.println("Autor: " + getAutor());
    }
}
