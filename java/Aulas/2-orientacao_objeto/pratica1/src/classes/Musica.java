package classes;

import java.util.Scanner;

public class Musica {
    private String titulo;
    private String artista;
    private int anoLancamento;
    private double avaliacoes;
    private int numAvaliacoes;
    private Scanner scanner = new Scanner(System.in);

    public void ficha()  {
        System.out.println("Tìtulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Avaliações: " + avaliacoes);
        System.out.println("Número de avaliações: " + numAvaliacoes);
    }

    public void Avaliacao() {
        System.out.println("Digite aqui sua nota sobre a música");
        double number = scanner.nextDouble();

    }

    public void mediaDeAvaliacoes() {
        System.out.println("Digite abaixo quantas notas você gostaria de dar para a música");
        int quantidadeNotas = scanner.nextInt();

        if (quantidadeNotas == 0 || quantidadeNotas < 1) {
            System.out.println("Você optou por não avaliar nenhuma vez, obrigado!");
        } else {
            double soma = 0;
            for (int i = 1; i <= quantidadeNotas; i++) {
                System.out.println("Digite a nota " + i + ": ");
                double nota = scanner.nextDouble();
                soma += nota;
            }

            double media = soma / quantidadeNotas;
            System.out.println("A média das avaliações é: " + media);
        }
    }

}
