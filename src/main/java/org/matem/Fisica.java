package org.matem;

public class Fisica extends Matematica{

    public Fisica(String nomeFuncao) {
        super(nomeFuncao);
    }

    public double calcularDistanciaEmTempo(double vi, double t, double a) {
        System.out.println("-------");System.out.println("calcularDistancia");System.out.println("-------");
        return (vi * t) + (0.5 * a * t * t);
    }



    public double calcularVelocidadeFinalRetonoDouble(double vi, double a, double t) {
        System.out.println("-------");System.out.println("calcularVelocidadeFinal");System.out.println("-------");
        return vi + (a * t);
    }



    public double calcularForcaSobreMassa(double massa, double aceleracao) {
        System.out.println("-------");System.out.println("calcularForca");System.out.println("-------");
        return massa * aceleracao;
    }


    public double calcularEnergiaCineticaSobreMassa(double massa, double velocidade) {
        System.out.println("-------");System.out.println("calcularEnergiaCinetica");System.out.println("-------");
        return 0.5 * massa * (velocidade * velocidade);
    }



    public double calcularTrabalhoForca(double forca, double distancia, double angulo) {
        System.out.println("-------");System.out.println("calcularTrabalho");System.out.println("-------");
        return forca * distancia * Math.cos(Math.toRadians(angulo));
    }



    public double calcularPressaoForca(double forca, double area) {
        System.out.println("-------");System.out.println("calcularPressao");System.out.println("-------");
        return forca / area;
    }



    public double calcularDensidadeMassa(double massa, double volume) {
        System.out.println("-------");System.out.println("calcularDensidade");System.out.println("-------");
        return massa / volume;
    }



    public double calcularPotenciaTrabalho(double trabalho, double tempo) {
        System.out.println("-------");System.out.println("calcularPotencia");System.out.println("-------");
        return trabalho / tempo;
    }


    public double calcularLeiSegundaNewtonForca(double forca, double massa) {
        System.out.println("-------");
        System.out.println("calcularLeiSegundaNewton");
        System.out.println("-------");
        return forca / massa;
    }



}
