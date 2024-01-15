package banco;

public class ContaCorrente extends ContaBancaria {

    public void cobrarTarifaMensal() {
        saldo = saldo - (saldo * 0.10);
    }
}
