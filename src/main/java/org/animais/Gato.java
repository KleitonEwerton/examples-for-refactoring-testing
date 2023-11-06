package org.animais;

public class Gato extends Animal{
    String nome;

    public Gato(String nome) {
        this.nome = nome;
    }
    public void falar(){
        System.out.println("falei");
    }
    public void andar(){
        System.out.println("andei");
    }

    public void voar(){
        System.out.println("não tenho asas");
    }

    public void nadar(){
        System.out.println("nadando");
    }
    public void seguir(){
        System.out.println("seguindo");
    }
}
