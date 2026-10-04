package org.example.aula7;
//3 — Peça o nome da pessoa e mostre a primeira letra dele.
import java.util.Scanner;

public class Atividade3Strings {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine(); // guarda o nome digitado

        // pega a primeira letra
        char primeiraLetra = nome.charAt(0);
        System.out.println("A primeira letra do seu nome é: " + primeiraLetra);


    }
}