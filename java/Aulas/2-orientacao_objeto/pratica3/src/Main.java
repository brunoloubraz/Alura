import banco.ContaBancaria;
import banco.ContaCorrente;
import numbers.GeradorPrimo;
import numbers.NumerosPrimos;
import numbers.VerificadorPrimo;
import pets.Cachorro;
import pets.Gato;

public class Main {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.setModelo("Sedan");
        meuCarro.definirPrecos(30000, 32000, 35000);
        meuCarro.exibirInfo();

        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();

        ContaBancaria conta = new ContaBancaria();
        conta.depositar(1000);
        conta.extrato();

        // Realizando operações na conta corrente
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(200);
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.extrato();
        contaCorrente.sacar(150);
        contaCorrente.extrato();

        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSeEhPrimo(17);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);
    }
}