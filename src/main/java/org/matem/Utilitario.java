package org.matem;

public class Utilitario {

    String nome;

    double representacao;

    public Utilitario(String nome, double rep) {
        this.nome = nome;
        this.representacao = rep;
    }
    public Utilitario() {

    }

    static void printar(String frase){
        System.out.println(frase);
    }


    static void contarAte(int x){
        for(int i =0; i <x;i += 1){
            System.out.println(i);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    static void contarAte30(){
        for(int i =0; i <30;i += 1){
            System.out.println(i);
        }
    }
}
