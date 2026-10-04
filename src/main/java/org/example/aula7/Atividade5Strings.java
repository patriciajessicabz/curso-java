package org.example.aula7;
//5 — Peça o nome da pessoa duas vezes e diga se os dois são iguais, ignorando maiúsculas e minúsculas.
//Digite seu nome: Ana
//Digite de novo: ANA
//Os nomes são iguais? true

import java.util.Scanner;

public class Atividade5Strings {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome minusculo:");
        String nome1 = sc.nextLine();
        System.out.println("Digite seu nome maiusculo");
        String nome2 = sc.nextLine();

        boolean SaoIguais = nome1.equalsIgnoreCase(nome2);

        System.out.println("Os nomes são iguais? " + SaoIguais);
    }
}
