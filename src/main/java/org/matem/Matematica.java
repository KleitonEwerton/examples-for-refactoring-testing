package org.matem;

public class Matematica extends Utilitario {

    String nomeFuncao;


    public Matematica(String nomeFuncao) {
        this.nomeFuncao = nomeFuncao;
    }

    public static int somaDeInteiro(int a, int b){
        return a + b;
    }

    public static double divisaoDouble(double a, double b){
        return a/b;
    }

    public static int subtracaoInteira(int a, int b){
        return a - b;
    }

    public static int multiplicacaoInteira(int a, int b){
        return a * b;
    }

    static void contarAte10(){
        for(int i =0; i <10;i += 1){
            System.out.println(i);
        }
    }

    static void contarAte20(){
        for(int i =0; i <20;i += 1){
            System.out.println(i);
        }
    }
    public static int potenciacao(int a, int b){
        return a ^ b;
    }

}
