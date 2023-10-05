import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
    Filme meufilme = new Filme();
    meufilme.setNome("O poderoso chefão");
    meufilme.setAnoDeLancamento(1970);
    meufilme.setDuracaoEmMinutos(180);
    System.out.println("Duração do filme: " + meufilme.getDuracaoEmMinutos());

    meufilme.exibeFichaTecnica();
    meufilme.avalia(8);
    meufilme.avalia(5);
    meufilme.avalia(10);
    System.out.println("Total de Avaliacões: " + meufilme.getTotalDeAvaliacoes());
//        System.out.println(meufilme.somaDasAvaliacoes);
        System.out.println(meufilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos() + " minutos");

        Filme avatar = new Filme();
        avatar.setNome("Avatar");
        avatar.setAnoDeLancamento(2023);
        avatar.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meufilme);
        calculadora.inclui(avatar);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meufilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}
