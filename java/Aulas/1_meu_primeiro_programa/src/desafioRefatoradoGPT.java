import java.util.Scanner;

public class desafioRefatoradoGPT {
    private static String nome = "Bruno Loureiro Braz";
    private static double saldo = 2500.00;
    private static String accType = "Corrente";
    private static Scanner leitura = new Scanner(System.in);

    public static void main(String[] args) {
        exibirInformacoesConta();

        int chosenItem = 0;

        while (chosenItem != 4) {
            exibirMenu();
            chosenItem = leitura.nextInt();

            switch (chosenItem) {
                case 1:
                    consultarSaldo();
                    break;
                case 2:
                    receberValor();
                    break;
                case 3:
                    transferirValor();
                    break;
                case 4:
                    System.out.println("Obrigado pela visita e volte sempre!");
                    break;
                default:
                    System.out.println("Digite um valor de 1 a 4");
            }
        }
    }

    private static void exibirInformacoesConta() {
        System.out.println(String.format("""
                Olá %s bem-vindo de volta!
                Tipo de conta: %s
                Saldo Atual: %.2f
                """, nome, accType, saldo));
    }

    private static void exibirMenu() {
        System.out.println("""
                Digite uma das opções abaixo
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                """);
    }

    private static void consultarSaldo() {
        System.out.println("Seu saldo atual é " + saldo + "\n");
    }

    private static void receberValor() {
        System.out.println("Digite o valor que deseja receber no seu saldo");
        saldo += leitura.nextDouble();
        consultarSaldo();
    }

    private static void transferirValor() {
        do {
            System.out.println(String.format("""
                    Seu saldo atual é de %.2f
                    Qual o valor você deseja retirar da sua conta bancária?
                    """, saldo));
            double valorRetirado = leitura.nextDouble();
            if (valorRetirado > saldo) {
                System.out.println("Digite um valor que esteja condizente com o seu saldo de R$ " + saldo + " reais");
            } else {
                saldo -= valorRetirado;
                System.out.println("Seu saldo atual é de " + saldo + "\n");
                break;
            }
        } while (true);
    }
}
