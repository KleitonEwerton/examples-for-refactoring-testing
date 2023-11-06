package org.animais;

public class Cachorro {

    String nome;

    public Cachorro(String nome) {
        this.nome = nome;
    }
    public static void falar(){
        System.out.println("falei");
    }
    public static void andar(){
        System.out.println("andei");
    }

    public static void voar(){
        System.out.println("não tenho asas");
    }

    public static void nadar(){
        System.out.println("nadando");
    }
    public static void seguir(){
        System.out.println("seguindo");
    }
}
