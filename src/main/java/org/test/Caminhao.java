package org.test;

class Caminhao extends Veiculo {
    private int capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, int capacidadeCarga) {
        super(marca, modelo, ano);
        this.capacidadeCarga = capacidadeCarga;
    }

    // Métodos na versão 1 (antes da refatoração)
    public void carregar() {
        System.out.println("Caminhão carregando");
    }

    public void descarregar() {
        System.out.println("Caminhão descarregando");
    }

    // Métodos na versão 2 (após a refatoração)
    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }
}
