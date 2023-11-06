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

    public static double calcularMedia(double[] numeros) {
        double soma = 0;
        for (double num : numeros) {
            soma += num;
        }
        double media = calcularMedia2(soma, numeros.length);
        System.out.println("A média dos números é: " + media);
        return media;
    }

    public static double calcularMedia2(double soma, int quantidade) {
        return soma / quantidade;
    }

    public static void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static boolean verificarParidade(int num) {
        boolean par = checkParidade(num);
        System.out.println("O número é par? " + par);
        return par;
    }

    public static boolean checkParidade(int num) {
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
        int fatorial = calcularFatorialRecursivo(n);
        System.out.println("O fatorial de " + n + " é: " + fatorial);
        return fatorial;
    }

    public static int calcularFatorialRecursivo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcularFatorialRecursivo(n - 1);
        }
    }

    public static int somarDoisNumeros(int a, int b) {
        int soma = somar(a, b);
        System.out.println("A soma de " + a + " e " + b + " é: " + soma);
        return soma;
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static void imprimirNumeroPorExtenso(int numero) {
        String numeroPorExtenso = obterNumeroPorExtenso(numero);
        System.out.println("Número por extenso: " + numeroPorExtenso);
    }

    public static String obterNumeroPorExtenso(int numero) {
        String[] unidades = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
        if (numero >= 0 && numero <= 9) {
            return unidades[numero];
        } else {
            return "Número fora do intervalo de 0 a 9";
        }
    }


}
