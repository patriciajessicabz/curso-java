package org.example.aula5;

import java.util.Scanner;

public class Scannear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);

      }

      }
