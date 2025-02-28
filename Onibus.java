package org.example;

public class Onibus extends Veiculo{
    public int quantEixos;
    public Onibus(String marca, String modelo, int ano, int quantPassageiros, String combustivel, int quantEixos) {
        super(marca, modelo, ano, quantPassageiros, combustivel);
        if(quantEixos < 6 || quantEixos > 8){
            throw new IllegalArgumentException("Ônibus deve ter entre 6 e 8 eixos!");
        }

        this.quantEixos = quantEixos;
    }

    @Override
    public float calcularAutonomia() {
        return 200 * 5;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Quantidade de Eixos: " + quantEixos);
    }
}
