package org.matem;

public class FisicaApp {

    public static void main(String[] args) {
        double velocidadeInicial = 20.0;
        double tempo = 5.0;
        double aceleracao = 2.0;
        double distancia = calcularDistancia(velocidadeInicial, tempo, aceleracao);
        System.out.println("A distância percorrida é: " + distancia + " metros");
    }

    public static double calcularDistancia(double vi, double t, double a) {
        return (vi * t) + (0.5 * a * t * t);
    }

    public static double calcularVelocidadeFinal(double vi, double a, double t) {
        return vi + (a * t);
    }

    public static double calcularForca(double massa, double aceleracao) {
        return massa * aceleracao;
    }

    public static double calcularEnergiaCinetica(double massa, double velocidade) {
        return 0.5 * massa * (velocidade * velocidade);
    }

    public static double calcularTrabalho(double forca, double distancia, double angulo) {
        return forca * distancia * Math.cos(Math.toRadians(angulo));
    }

    public static double calcularPressao(double forca, double area) {
        return forca / area;
    }

    public static double calcularDensidade(double massa, double volume) {
        return massa / volume;
    }

    public static double calcularPotencia(double trabalho, double tempo) {
        return trabalho / tempo;
    }

    public static double calcularLeiSegundaNewton(double forca, double massa) {
        return forca / massa;
    }
}
