package org.example;

public  class CaminhaoRefrigerado extends Caminhao {
        private float temperaturaMinima;

        public CaminhaoRefrigerado(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, float capacidadeCarga, float temperaturaMinima) {
            super(marca, modelo, ano, capacidadePassageiros, combustivel, capacidadeCarga);
            this.temperaturaMinima = temperaturaMinima;
        }

        @Override
        public float calcularAutonomia() {
            return super.calcularAutonomia() * 0.9f;
        }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Temperatura Mínima: " + temperaturaMinima + "°C");
    }
    }

