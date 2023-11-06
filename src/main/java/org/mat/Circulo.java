package org.mat;

import org.mat.Forma;

public class Circulo extends Forma {
    int raio;

    public Circulo(int raio) {
        super();
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
}
