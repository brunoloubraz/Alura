package coinConversor;

public class ConversorMoeda implements ConversaoFinanceira{
    private double valor;
    public void converterDolarParaReal(double valorDolar) {
        System.out.println("R$" + valorDolar * 5 );
    }
}
