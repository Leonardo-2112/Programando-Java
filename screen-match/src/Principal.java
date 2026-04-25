import br.com.alua.screenmatch.modelos.Filme;
import br.com.alua.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        //Instancia o objeto Filme
        Filme meuFilme = new Filme();
        //Atribui valores ao objeto Filme
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);
        System.out.println("Duração do Filme: " + meuFilme.getDuracaoEmMinutos());
        meuFilme.avaliacao(8);
        meuFilme.avaliacao(5);
        meuFilme.avaliacao(10);
        //Chama o metodo
        meuFilme.exibeFichaTecnica();
        System.out.println("Total de Avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações do filme: " + meuFilme.getNome() + "\n" + meuFilme.pegaMedia());

        //Instancia o objeto Serie
        Serie lost = new Serie();
        //Atribui valores ao objeto Serie
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

    }
}
