package org.example.aula7;

import java.util.Scanner;

//4 — Peça 5 números para a pessoa, guarde num array, e depois mostre todos de trás pra frente.
public class ArraysAtividade04 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + " número: ");
            numeros[i] = sc.nextInt();
        }
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
