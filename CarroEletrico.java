package org.example;

class CarroEletrico extends Carro {
    private float bateriaKWh;

    public CarroEletrico(String marca, String modelo, int ano, int capacidadePassageiros, float bateriaKWh, String tipoCarro) {
        super(marca, modelo, ano, capacidadePassageiros, "Elétrico", tipoCarro);
        this.bateriaKWh = bateriaKWh;
    }

    @Override
    public float calcularAutonomia() {
        return bateriaKWh * 5;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Bateria: " + bateriaKWh + " kWh");
    }
}
