package org.example;

abstract public class Veiculo {
    public String marca;
    public String modelo;
    public int ano;
    public int quantPassageiros;
    public String combustivel;

    public Veiculo(String marca, String modelo, int ano, int quantPassageiros, String combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quantPassageiros = quantPassageiros;
        this.combustivel = combustivel;
    }

    public abstract float calcularAutonomia();

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Ano: " + ano +
                " | Passageiros: " + quantPassageiros + " | Combustível: " + combustivel);
    }
}