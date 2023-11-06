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
        System.out.println("-------");System.out.println("calcularDistancia");System.out.println("-------");
        return (vi * t) + (0.5 * a * t * t);
    }

    public static double calcularVelocidadeFinal(double vi, double a, double t) {
        System.out.println("-------");System.out.println("calcularVelocidadeFinal");System.out.println("-------");
        return vi + (a * t);
    }

    public static double calcularForca(double massa, double aceleracao) {
        System.out.println("-------");System.out.println("calcularForca");System.out.println("-------");
        return massa * aceleracao;
    }

    public static double calcularEnergiaCinetica(double massa, double velocidade) {
        System.out.println("-------");System.out.println("calcularEnergiaCinetica");System.out.println("-------");
        return 0.5 * massa * (velocidade * velocidade);
    }

    public static double calcularTrabalho(double forca, double distancia, double angulo) {
        System.out.println("-------");System.out.println("calcularTrabalho");System.out.println("-------");
        return forca * distancia * Math.cos(Math.toRadians(angulo));
    }

    public static double calcularPressao(double forca, double area) {
        System.out.println("-------");System.out.println("calcularPressao");System.out.println("-------");
        return forca / area;
    }

    public static double calcularDensidade(double massa, double volume) {
        System.out.println("-------");System.out.println("calcularDensidade");System.out.println("-------");
        return massa / volume;
    }

    public static double calcularPotencia(double trabalho, double tempo) {
        System.out.println("-------");System.out.println("calcularPotencia");System.out.println("-------");
        return trabalho / tempo;
    }

    public static double calcularLeiSegundaNewton(double forca, double massa) {
        System.out.println("-------");
        System.out.println("calcularLeiSegundaNewton");
        System.out.println("-------");
        return forca / massa;
    }
}
