package org.test;

class Carro extends Veiculo {
    public Carro(String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano);

    }

    public void acelerar() {
        System.out.println("Veículo acelerando");
    }

    public void frear() {
        System.out.println("Veículo freando");
    }
}