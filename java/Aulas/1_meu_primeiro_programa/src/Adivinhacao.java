import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        int tentativas = 5;
        Scanner leitura = new Scanner(System.in);
        int palpite = 0;
        int resultado = new Random().nextInt(100);

        while(tentativas > 0) {
            if (tentativas > 0) {
                System.out.println("Digite o seu palpite de 0 a 100");
                palpite = leitura.nextInt();
                if (palpite == resultado) {
                    System.out.println("Parabéns!!! Você acertou!!");
                    break;
                } else {
                    System.out.println("Palpite errado!");
                    if (palpite > resultado) {
                        System.out.println("O seu palpite foi maior que o resultado");
                    }
                    else {
                        System.out.println("O seu palpite foi menor que o resultado");
                    }
                    tentativas--;
                }
            }
            if (tentativas == 0 ) {
                System.out.println("Você perdeu! O valor correto era " + resultado);
            }
        }
    }
}
