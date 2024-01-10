package classes;

import java.util.Scanner;

public class Calculadora {
    private Scanner scanner = new Scanner(System.in);

    public double numberDouble () {
        System.out.print("Digite um número: ");
        double number = scanner.nextDouble();
        return number * 2;
    }
}
