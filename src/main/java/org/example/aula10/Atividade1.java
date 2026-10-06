package org.example.aula10;

import java.util.Scanner;
//1 — Faça um programa que peça dois números inteiros e mostre a divisão do primeiro pelo segundo.
// Se a pessoa digitar 0 no segundo, trate a ArithmeticException e mostre uma mensagem explicando
// que não dá pra dividir por zero.

public class Atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int numero1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numero2 = sc.nextInt();

        try {
            int resutado = numero1 / numero2;
            System.out.println(resutado);

        }catch (ArithmeticException ae){
            System.out.println("Não se divide por 0!");
        }
    }

}