import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
    Filme meufilme = new Filme();
    meufilme.setNome("O poderoso chefão");
    meufilme.setAnoDeLancamento(1970);
    meufilme.setDuracaoEmMinutos(180);

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
    }
}
