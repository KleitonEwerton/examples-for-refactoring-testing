package org.test;
// Classe principal Veiculo
class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private int capacidadeCarga;
    private int portas;
    private boolean partidaEletrica;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public int getPortas() {
        return portas;
    }

    public boolean hasPartidaEletrica() {
        return partidaEletrica;
    }





}