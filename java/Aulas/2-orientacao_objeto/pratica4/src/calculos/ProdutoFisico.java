package calculos;

public class ProdutoFisico implements Calculavel{
    @Override
    public double calcularPrecoFinal(double valor) {
        return valor * 4;
    }
}
