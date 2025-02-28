package org.example;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2022, 5, "Gasolina", "Sedan");
        Caminhao caminhao = new Caminhao("Volvo", "FH", 2020, 2, "Diesel", 10);
        Onibus onibus = new Onibus("Mercedes", "Busscar", 2018, 50, "Diesel", 6);
        CarroEletrico carroEletrico = new CarroEletrico("Tesla", "Model 3", 2023, 5, 75, "Sedan");
        CaminhaoRefrigerado caminhaoRefrigerado = new CaminhaoRefrigerado("Scania", "R450", 2021, 2, "Diesel", 15, -20);

        Veiculo[] veiculos = {carro, caminhao, onibus, carroEletrico, caminhaoRefrigerado};

        for (Veiculo v : veiculos) {
            v.exibirDetalhes();
            System.out.println("Autonomia: " + v.calcularAutonomia() + " km");
            System.out.println("--------------------------------");
        }
    }
}
