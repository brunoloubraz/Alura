package vendas;

public class Servico implements Vendavel{
    private double desconto = 0.50;
    @Override
    public double totalPrice(double price, int quantidade) {
        return (price * quantidade) - ((price * quantidade) * desconto);
    }
}
