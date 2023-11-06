package org.test;

class Caminhao extends Veiculo {
    public Caminhao(String marca, String modelo, int ano, int capacidadeCarga) {
        super(marca, modelo, ano);

    }

    public void carregar() {
        System.out.println("Veículo carregando");
    }

    public void descarregar() {
        System.out.println("Veículo descarregando");
    }
}
