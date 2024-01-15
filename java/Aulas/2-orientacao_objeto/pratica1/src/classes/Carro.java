package classes;

public class Carro {
    private String modelo;
    private int ano;
    private String cor;

    void ficha() {
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Ano do carro: " + ano);
        System.out.println("Cor do carro: " + cor);
    }

    public static void calculaAno(int year){
        System.out.printf("O seu carro possui %s anos", 2024 - year);
    }
}
