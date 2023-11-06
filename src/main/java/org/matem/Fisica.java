package org.matem;

public class Fisica extends Matematica{

    public Fisica(String nomeFuncao) {
        super(nomeFuncao);
    }

    public double calcularDistanciaEmTempo(double vi, double t, double a) {
        return calcularDistanciaEmTempo2(vi, t, a);
    }

    public double calcularDistanciaEmTempo2(double vi, double t, double a) {
        System.out.println("-------");System.out.println("calcularDistancia");System.out.println("-------");
        return (vi * t) + (0.5 * a * t * t);
    }


    public double calcularVelocidadeFinalRetonoDouble(double vi, double a, double t) {
        return calcularVelocidadeFinalRetonoDouble2(vi, a,t);
    }

    public double calcularVelocidadeFinalRetonoDouble2(double vi, double a, double t) {
        System.out.println("-------");System.out.println("calcularVelocidadeFinal");System.out.println("-------");
        return vi + (a * t);
    }

    public double calcularForcaSobreMassa(double massa, double aceleracao) {
        return calcularForcaSobreMassa2(massa, aceleracao);
    }
    public double calcularForcaSobreMassa2(double massa, double aceleracao) {
        System.out.println("-------");System.out.println("calcularForca");System.out.println("-------");
        return massa * aceleracao;
    }

    public double calcularEnergiaCineticaSobreMassa(double massa, double velocidade) {
        return calcularEnergiaCineticaSobreMassa2(massa, velocidade);
    }

    public double calcularEnergiaCineticaSobreMassa2(double massa, double velocidade) {
        System.out.println("-------");System.out.println("calcularEnergiaCinetica");System.out.println("-------");
        return 0.5 * massa * (velocidade * velocidade);
    }

    public double calcularTrabalhoForca(double forca, double distancia, double angulo) {
        return calcularTrabalhoForca2(forca, distancia, angulo);
    }

    public double calcularTrabalhoForca2(double forca, double distancia, double angulo) {
        System.out.println("-------");System.out.println("calcularTrabalho");System.out.println("-------");
        return forca * distancia * Math.cos(Math.toRadians(angulo));
    }

    public double calcularPressaoForca(double forca, double area) {
        return calcularPressaoForca2( forca,  area);
    }

    public double calcularPressaoForca2(double forca, double area) {
        System.out.println("-------");System.out.println("calcularPressao");System.out.println("-------");
        return forca / area;
    }

    public double calcularDensidadeMassa(double massa, double volume) {
        return  calcularDensidadeMassa2(massa, volume);
    }

    public double calcularDensidadeMassa2(double massa, double volume) {
        System.out.println("-------");System.out.println("calcularDensidade");System.out.println("-------");
        return massa / volume;
    }

    public double calcularPotenciaTrabalho(double trabalho, double tempo) {
        return calcularPotenciaTrabalho2(trabalho, tempo);
    }
    public double calcularPotenciaTrabalho2(double trabalho, double tempo) {
        System.out.println("-------");System.out.println("calcularPotencia");System.out.println("-------");
        return trabalho / tempo;
    }

    public double calcularLeiSegundaNewtonForca(double forca, double massa) {
        return calcularLeiSegundaNewtonForca2(forca, massa);
    }

    public double calcularLeiSegundaNewtonForca2(double forca, double massa) {
        System.out.println("-------");
        System.out.println("calcularLeiSegundaNewton");
        System.out.println("-------");
        return forca / massa;
    }

}
