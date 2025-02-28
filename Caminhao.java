package org.example;

public class Caminhao extends Veiculo{
    public float capacidadeCarga;
    public Caminhao(String marca, String modelo, int ano, int quantPassageiros, String combustivel, float capacidadeCarga) {
        super(marca, modelo, ano, quantPassageiros, combustivel);
        this.capacidadeCarga = capacidadeCarga;
    }

    public void setCapacidadeCarga(float capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public float calcularAutonomia() {
        float reducao = Math.min(25, capacidadeCarga);
        float consumo = 6 *(1-(reducao/100));
        return 300 * consumo;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Capacidade de Carga: " + capacidadeCarga + " toneladas");
    }
}