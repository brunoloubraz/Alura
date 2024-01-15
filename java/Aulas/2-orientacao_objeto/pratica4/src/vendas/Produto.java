package vendas;

public class Produto implements  Vendavel{
    private double desconto = 0.20;
    @Override
    public double totalPrice(double price, int quantidade) {
        return (price * quantidade) - ((price * quantidade) * desconto);
    }
}
