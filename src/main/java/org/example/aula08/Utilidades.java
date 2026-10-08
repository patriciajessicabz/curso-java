package org.example.aula08;
//2 — Crie um método saudar(String nome) que imprime "Olá, [nome]! Tudo bem?".
// Chame ele três vezes, passando nomes diferentes.
public class Utilidades {

    // Atividade 2

    public static void saudar(String nome) {
        System.out.println("Olá! " + nome + "! Tudo bem? ");

    }
    // Atividade 3

    public static int dobro(int numero) {
        return numero * 2;
    }
    // Atividade 4

    public static double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2;
    }
    // Atividade 5

    public static boolean ehMaiorDeIdade(int idade) {
        return idade >= 18;
    }
    // Atividade 6

    public  static  int somar(int a, int b ){
        return a + b;
    }
    public static int somar(int a, int b, int c){
        return  a + b + c;

    }
    public static double somar (double a, double b){
        return a + b;
    }
    // Atividade 7

    public static void saudacao () {
        System.out.println("Olá");
    }

        public static void saudacao (String nome) {
            System.out.println("Olá, " + nome + "!");
        }

    }



