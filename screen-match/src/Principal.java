import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        //Instancia o objeto Filme
        Filme meuFilme = new Filme();
        //Atribui valores ao objeto Filme
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.avaliacao(8);
        meuFilme.avaliacao(5);
        meuFilme.avaliacao(10);
        //Chama o metodo e exibe valores
        meuFilme.exibeFichaTecnica();
        System.out.println("Total de Avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações do filme: " + meuFilme.pegaMedia());
        System.out.println("==================================================================\n");

        //Instancia o objeto Serie
        Serie lost = new Serie();
        //Atribui valores ao objeto Serie
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        lost.avaliacao(8);
        lost.avaliacao(5);
        lost.avaliacao(10);
        //Exibe os valores
        lost.exibeFichaTecnica();
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());
        System.out.println("Total de Avaliações: " + lost.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações da série: " + lost.pegaMedia());
        System.out.println("==================================================================\n");

        //Instancia o objeto Filme
        Filme outroFilme = new Filme();
        //Atribui valores ao objeto Filme
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);
        outroFilme.setIncluidoNoPlano(false);
        outroFilme.avaliacao(8);
        outroFilme.avaliacao(5);
        outroFilme.avaliacao(10);
        //Chama o metodo e exibe valores
        outroFilme.exibeFichaTecnica();
        System.out.println("Total de Avaliações: " + outroFilme.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações do filme: " + outroFilme.pegaMedia());
        System.out.println("==================================================================\n");

        //Instancia o objeto Calculadora de Tempo
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println("Soma da duração dos titulos: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

    }
}
