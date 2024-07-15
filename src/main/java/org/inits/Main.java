package org.inits;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        falarFrase2("Eu sou uma frase", "João");

        notificarComFrase2("Mensagem");

    }

    // this is comment
    public static String falarFrase2(String frase, String pessoa) {
        return "A pessoa " + pessoa + " esta falando que: " + frase;
    }

    public static void notificarComFrase2(String extra) {
        System.out.println("Eu sou uma notificação! " + extra);
    }

}