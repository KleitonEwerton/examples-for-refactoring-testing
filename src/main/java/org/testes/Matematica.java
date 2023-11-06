package org.testes;

public class Matematica extends Utilitario {

    String nomeFuncao;


    public Matematica(String nomeFuncao) {
        this.nomeFuncao = nomeFuncao;
    }

    public static double soma(int a, int b){
        return a + b;
    }

    public static double divisaoInteira(double a, double b){
        return a/b;
    }

    public static int subtracao(int a, int b){
        return a - b;
    }

    public static int multiplicacao(int a, int b){
        return a * b;
    }


    public static int potencia(int a, int b){
        return a ^ b;
    }

}
