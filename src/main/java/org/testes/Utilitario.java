package org.testes;

public class Utilitario {

    String nome;

    int representacao;

    public Utilitario(String nome, int rep) {
        this.nome = nome;
        this.representacao = rep;
    }
    public Utilitario() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
