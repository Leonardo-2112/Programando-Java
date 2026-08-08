package OrientacaoObjetos.Pratica.Exercicio02;

public class Livro {
    private String titulo;
    private String autor;
    private int pagina;

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

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

    public void exibirDados(){
        System.out.printf("\"%s\" de %s com %d páginas%n", titulo, autor, pagina);
    }

}
