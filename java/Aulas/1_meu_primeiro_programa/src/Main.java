// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// Press Opt+Enter with your caret at the highlighted text to see how
// IntelliJ IDEA suggests fixing it.
// Press Ctrl+R or click the green arrow button in the gutter to run the code.
// Press Ctrl+D to start debugging your code. We have set one breakpoint
// for you, but you can always add more by pressing Cmd+F8.

public class Main {
    public static void main(String[] args) {
//        Padrão de CamelCase
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        double media = (9.8 + 6.3 + 8.0) / 3;
        String sinopse;
        int classificacao = (int) (media/2);
        System.out.println(classificacao);
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");


        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        sinopse = """
        Filme Top Gun
        Filme de aventura com galã dos anos 80
        Muito bom!
        Ano de lançamento
        """;
        System.out.println(sinopse);
//        for (int i = 1; i <= 5; i++) {
//        if (i % 2 == 0) System.out.println("Este é numero é par");
//        else System.out.println("Este numero é ímpar");
//            System.out.println("i = " + i);
//
//        }
        String nome = "Bruno";
        int idade = 24;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos", nome, idade));
        String mensagemCompleta = """
                Olá %s!
                Eu tenho %d anos
                Este é um aplicativo para falar sobre o filme que lançou em %s
                """.formatted(nome, idade, anoDeLancamento);
        System.out.println(mensagemCompleta);

        double temperatura = 37.5;
        int fahrenheit = (int)(temperatura * 1.8) + 32;
        System.out.println(fahrenheit);

    }
}