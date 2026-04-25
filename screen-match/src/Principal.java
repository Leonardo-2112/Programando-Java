import br.com.alua.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica();

        meuFilme.avaliacao(8);
        meuFilme.avaliacao(5);
        meuFilme.avaliacao(10);
        System.out.println("Total de Avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações do filme: " + meuFilme.getNome() + "\n" + meuFilme.pegaMedia());
    }
}
