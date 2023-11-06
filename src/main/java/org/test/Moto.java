package org.test;

class Moto extends Veiculo {
    public Moto(String marca, String modelo, int ano, boolean partidaEletrica) {
        super(marca, modelo, ano);

    }

    public void ligar() {
        System.out.println("Veículo ligado");
    }

    public void desligar() {
        System.out.println("Veículo desligado");
    }
}
