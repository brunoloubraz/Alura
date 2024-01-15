package tabuada;

public class TabuadaMultiplicacao implements Tabuada{

    @Override
    public void mostrarTabuada(int number) {
        System.out.println("Apresentando a tabuada do numero " +  number);
        for (int i = 0; i < 10; i++) {
            System.out.print(number * i + " ");
        }
    }
}
