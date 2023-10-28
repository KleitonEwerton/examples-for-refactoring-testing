package org.init;

import static org.matematica.Matematica.divisaoInteira;
import static org.matematica.Matematica.soma;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        soma(2.3,3.4);
        falar("Eu sou uma frase", "João");
        divisaoInteira(2,2);
        notificar("Mensagem");

    }

    public static String falar(String frase, String pessoa){
        return "A pessoa "+ pessoa +" esta falando que: " + frase;
    }

    public static void notificar(String extra){
        System.out.println("Eu sou uma notificação! "+extra);
    }

}