package org.init;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    soma(2,3);
    falar("Eu sou uma frase");
    divisao(2,2);
    notificar();

    }

    public static int soma(int a, int b){
        return a + b;
    }

    public static String falar(String frase){
        return "A pessoa esta falando que: " + frase;
    }

    public static int divisao(int a, int b){
        return a/b;
    }

    public static void notificar(){
        System.out.println("Eu sou uma notificação");
    }

}