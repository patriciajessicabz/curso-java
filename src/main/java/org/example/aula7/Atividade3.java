package org.example.aula7;

import java.util.Scanner;
//3 — Peça o nome da pessoa e mostre a primeira letra dele.
public class Atividade3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = sc.nextLine(); // guarda o nome digitado

        // pega a primeira letra
        char primeiraLetra = nome.charAt(0);


    }
}