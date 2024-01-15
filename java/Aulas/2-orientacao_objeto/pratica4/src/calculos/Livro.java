package calculos;

public class Livro implements Calculavel{
    @Override
    public double calcularPrecoFinal(double valor) {
        return valor * 2;
    }
}
