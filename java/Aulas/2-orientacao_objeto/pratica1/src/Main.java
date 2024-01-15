import classes.Calculadora;
import classes.Carro;
import classes.Musica;
import classes.Pessoa;
import classes.Aluno;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Calculadora calculadora = new Calculadora();
        Musica musica =  new Musica();
        Pessoa.saudacao();
        System.out.println(calculadora.numberDouble());
        musica.Avaliacao();
        musica.mediaDeAvaliacoes();
        Carro carro = new Carro();
        Carro.calculaAno(2020);
        Aluno meuAluno = new Aluno();
        meuAluno.nome = "Akemi";
        meuAluno.idade = 18;
        meuAluno.exibeInformacoes();
    }
}