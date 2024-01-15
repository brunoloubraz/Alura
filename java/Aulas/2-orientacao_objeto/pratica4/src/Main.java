import calculateRectangle.CalculadoraSalaRetangular;
import calculos.Livro;
import calculos.ProdutoFisico;
import coinConversor.ConversorMoeda;
import tabuada.TabuadaMultiplicacao;
import temperature.ConversorTemperatura;
import temperature.ConversorTemperaturaPadrao;
import vendas.Produto;
import vendas.Servico;
import vendas.Vendavel;

public class Main {
    public static void main(String[] args) {
        ConversorMoeda converteParaReal = new ConversorMoeda();
        converteParaReal.converterDolarParaReal(50);
        CalculadoraSalaRetangular calculos = new CalculadoraSalaRetangular();

        calculos.calcularPerimetro(2,4);
        calculos.calcularArea(2,4);

        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(2);

        ConversorTemperatura conversor = new ConversorTemperaturaPadrao();

        double temperaturaCelsius = 25;
        double temperaturaFahrenheit = conversor.celsiusParaFahrenheit(temperaturaCelsius);
        System.out.println(temperaturaCelsius + " Celsius é igual a " + temperaturaFahrenheit + " Fahrenheit.");

        temperaturaFahrenheit = 77;
        temperaturaCelsius = conversor.fahrenheitParaCelsius(temperaturaFahrenheit);
        System.out.println(temperaturaFahrenheit + " Fahrenheit é igual a " + temperaturaCelsius + " Celsius.");

        Livro livro = new Livro();
        System.out.println(livro.calcularPrecoFinal(10));
        ProdutoFisico produtoFisico = new ProdutoFisico();
        System.out.println(produtoFisico.calcularPrecoFinal(10));

        Produto product = new Produto();
        System.out.println(product.totalPrice(10, 1));

        Servico service = new Servico();
        System.out.println(service.totalPrice(2,4));
    }
}