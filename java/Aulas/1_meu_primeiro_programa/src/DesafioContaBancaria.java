import java.util.Scanner;

public class DesafioContaBancaria {
    public static void main(String[] args) {
        String nome = "Bruno Loureiro Braz";
        Double saldo = 2500.00;
        String accType = "Corrente";
        Scanner leitura = new Scanner(System.in);
        int chosenItem = 0;
        String menu = """
                    Digite uma das opções abaixo
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    """;
        System.out.println(String.format("""
                Olá %s bem vindo de volta!
                Tipo de conta: %s
                Saldo Atual: %.2f
                """,nome, accType, saldo));

        while (chosenItem != 4) {
            System.out.println(menu);
            chosenItem = leitura.nextInt();

            if (chosenItem == 1) {
                System.out.println("Seu saldo atual é " + saldo + "\n");
            }
            else if (chosenItem == 2) {
                System.out.println("Digite o valor que deseja receber no seu saldo");
                saldo += leitura.nextDouble();
                System.out.println("Seu saldo atual é de " + saldo + "\n");
            }
            else if (chosenItem == 3) {
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
            else if (chosenItem == 4) {
                System.out.println("Obrigado pela visita e volte sempre!");
                break;
            } else {
                System.out.println("Digite um valor de 1 a 4");
            }
        }
    }
}
