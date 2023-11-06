package org.testes;

public class Matematica extends Utilitario {

    String nomeFuncao;


    public Matematica(String nomeFuncao) {
        this.nomeFuncao = nomeFuncao;
    }

    public static double soma(double a, double b){
        return a + b;
    }

    public static double divisaoInteira(int a, int b){
        return a/b;
    }

    public static double subtracao(double a, double b){
        return a - b;
    }

    public static double multiplicacao(double a, double b){
        return a * b;
    }


    public static int potencia(int a, int b){
        return a ^ b;
    }

}
