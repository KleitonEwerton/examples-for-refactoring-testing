package org.test;
// Subclasse Carro
class Carro extends Veiculo {
    private int portas;

    public Carro(String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano);
        this.portas = portas;
    }

    // Métodos na versão 1 (antes da refatoração)
    public void acelerar() {
        System.out.println("Carro acelerando");
    }

    public void frear() {
        System.out.println("Carro freando");
    }

    // Métodos na versão 2 (após a refatoração)
    public int getPortas() {
        return portas;
    }
}