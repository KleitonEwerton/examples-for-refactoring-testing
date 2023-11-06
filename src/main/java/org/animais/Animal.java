package org.animais;

public class Animal {
    String nome;
    int idade;
    String tipo;

    public Animal(String nome){
    this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
