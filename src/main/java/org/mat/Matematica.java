package org.mat;

public class Matematica extends Utilitario {

    String nomeFuncao;


    public Matematica(String nomeFuncao) {
        this.nomeFuncao = nomeFuncao;
    }

    public static int soma(int a, int b){
        return a + b;
    }

    public static double divisaoInteira(double a, double b){
        return a/b;
    }

    public static double subtracao(double a, double b){
        return a - b;
    }

    public static double multiplicacao(int a, int b){
        return a * b;
    }


    public static int potencia(int a, int b){
        return a ^ b;
    }

}
