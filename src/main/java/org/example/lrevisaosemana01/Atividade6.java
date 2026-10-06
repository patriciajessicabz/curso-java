package org.example.lrevisaosemana01;

import java.util.Scanner;

public class Atividade6 {
    /* 6 - Crie um programa para cadastrar um usuário. Siga exatamente esta ordem:
Peça para o usuário digitar o seu Ano de Nascimento (leia usando nextInt()).
Logo em seguida, peça para ele digitar o seu Nome Completo (leia usando nextLine()).
Por fim, imprima uma mensagem concatenada: "O usuário [NOME] nasceu em [ANO]." */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu ano de nascimento: ");

        int ano = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Digite seu nome completo: ");

        String nome = scanner.nextLine();

        System.out.println("O usuário " + nome + " nasceu em " + ano + ".");


    }
    }