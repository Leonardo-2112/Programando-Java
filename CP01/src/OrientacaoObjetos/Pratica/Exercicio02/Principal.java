package OrientacaoObjetos.Pratica.Exercicio02;

public class Principal {
    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.setTitulo("O Pequeno Principe");
        livro.setAutor("Não sei");
        livro.setPagina(200);

        livro.exibirDados();
    }
}
