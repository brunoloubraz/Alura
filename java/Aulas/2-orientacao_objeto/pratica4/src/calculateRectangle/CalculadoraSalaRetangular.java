package calculateRectangle;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public void calcularArea(double altura, double largura) {
        System.out.println("Area de " + altura * largura);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        System.out.println("Perimetro de "+ 2 * (altura + largura));
    }
}
