package org.init;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        soma(2.3,3.4);
    falar("Eu sou uma frase");
    divisaoInteira(2,2);
    notificar("Mensagem");

    }

    public static double soma(double a, double b){
        return a + b;
    }

    public static int divisaoInteira(int a, int b){
        return a/b;
    }

    public static String falar(String frase){
        return "A pessoa esta falando que: " + frase;
    }

    public static void notificar(String extra){
        System.out.println("Eu sou uma notificação! "+extra);
    }

}