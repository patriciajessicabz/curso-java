package org.example.aula7;

import java.util.Scanner;

public class Atividade2 {
    static void main() {
        //2 — Peça o nome da pessoa e mostre ele todo em MAIÚSCULO e todo em minúsculo.

        Scanner scanner= new Scanner(System.in);

        System.out.println(" Digite seu nome:");
        String nome = scanner.nextLine(); // guarda o nome digitado...

        //transforma em maiúsculo
        String Maiusculo = nome.toUpperCase();

        String Minusculo = nome.toLowerCase();

        System.out.println("Nome em maiúsculo: " + Maiusculo);
        System.out.println("Nome em minúsculo: " + Minusculo);

    }
}
