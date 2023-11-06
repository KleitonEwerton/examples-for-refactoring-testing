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


    //aq

    public static void main(String[] args) {
        int numero = 5;
        int resultado = calcularQuadrado(numero);
        System.out.println("O quadrado de " + numero + " é: " + resultado);
    }

    public static int calcularQuadrado(int num) {
        return num * num;
    }

    public static void imprimirMensagem() {
        System.out.println("Olá, Mundo!");
    }

    public static double calcularMedia(double[] numeros) {
        double soma = 0;
        for (double num : numeros) {
            soma += num;
        }
        return soma / numeros.length;
    }

    public static void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static boolean verificarParidade(int num) {
        return num % 2 == 0;
    }

    public static String concatenarStrings(String[] strings) {
        StringBuilder resultado = new StringBuilder();
        for (String str : strings) {
            resultado.append(str);
        }
        return resultado.toString();
    }

    public static int calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcularFatorial(n - 1);
        }
    }

    public static int somarDoisNumeros(int a, int b) {
        return a + b;
    }

    public static void imprimirNumeroPorExtenso(int numero) {
        String[] unidades = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
        if (numero >= 0 && numero <= 9) {
            System.out.println("Número por extenso: " + unidades[numero]);
        } else {
            System.out.println("Número fora do intervalo de 0 a 9");
        }
    }


}
