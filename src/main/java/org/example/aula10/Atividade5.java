package org.example.aula10;

import java.util.Scanner;

//5 — Peça um número para a pessoa e mostre o resto da divisão de 100 por esse número.
// Trate a ArithmeticException para o caso de ela digitar 0.
public class Atividade5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite um numero: ");
            int numero = sc.nextInt();
            System.out.println("O resto da divisão de 100 por " + numero + " é: " + (100 % numero));
        } catch (ArithmeticException ae){
            System.out.println("Erro: Não é possível dividir ou calcular o resto por zero!");
        }



    }
}
