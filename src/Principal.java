import br.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Back to the future");
        meuFilme.setAnoDelancamento(1985);
        meuFilme.setDuracaoEmMinutos(116);
        System.out.println("Duracao do Filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        System.out.println("Esse e o total de avaliacoes: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie euphoria = new Serie();
        euphoria.setNome("Euphoria");
        euphoria.setAnoDelancamento(2019);
        euphoria.setTemporadas(2);
        euphoria.exibeFichaTecnica();
        euphoria.setEpisodiosPorTemporada(10);
        euphoria.setMinutosPorEpisodios(50);
        System.out.println("Duracao para maratonar Euphoria: " + euphoria.getDuracaoEmMinutos());

        Filme novoFilme = new Filme();
        novoFilme.setNome("Back to the future II");
        novoFilme.setAnoDelancamento(1987);
        novoFilme.setDuracaoEmMinutos(120);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(novoFilme);
        calculadora.inclui(euphoria);
        System.out.println("Filmes para maratonar: " + meuFilme.getNome() + " , " + novoFilme.getNome() + " e " + euphoria.getNome() + ". Duracao total de: " + calculadora.getTempoTotal() + " Minutos" );

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(euphoria);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);


    }
}
