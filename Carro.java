package org.example;

public class Carro extends Veiculo{
    public String tipoCarro;
    public Carro(String marca, String modelo, int ano, int quantPassageiros, String combustivel, String tipoCarro) {
        super(marca, modelo, ano, quantPassageiros, combustivel);
        this.tipoCarro = tipoCarro;
    }

    @Override
    public float calcularAutonomia() {
        return 50 * 12;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo de Carro: " + tipoCarro);
    }
}