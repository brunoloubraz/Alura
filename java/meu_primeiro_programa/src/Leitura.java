import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println(filme);
        System.out.println("Qual o ano de Lançamento?");
        int anoDeLancamentp = leitura.nextInt();
        System.out.println(anoDeLancamentp);
        System.out.println("Diga sua avaliação de 0 a 10");
        double avaliacao = leitura.nextDouble();
        if (avaliacao > 10 || avaliacao < 0 ) System.out.printf("Valor maior ou menor");
        else System.out.println(avaliacao);
    }
}
