package banco;

public class ContaBancaria {
    protected double saldo;

    public void depositar(double valor) {
        this.saldo += valor;
    }
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            System.out.println("Saque realizado com sucesso");
        this.saldo -= valor;
        }
    }
    public void extrato() {
        System.out.println("Você possui R$" + saldo + " na conta");
    }
}
