package org.mat;

import org.mat.Forma;

public class Retangulo extends Forma {

    int lados;

    public Retangulo(int lados) {
        this.lados = lados;
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }
}
