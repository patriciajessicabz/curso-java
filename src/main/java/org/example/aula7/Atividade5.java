package org.example.aula7;

import java.util.Scanner;

public class Atividade5 {
    static void main() {
        //5 — Peça o nome da pessoa duas vezes e diga se os dois são iguais, ignorando maiúsculas e minúsculas.
        //Digite seu nome: Ana
        //Digite de novo: ANA
        //Os nomes são iguais? true

                Scanner sc = new Scanner(System.in);
                String nomeminusculo;
                String nomeMaiusculo;

                System.out.println("Digite seu nome minusculo:");
                nomeminusculo = sc.nextLine();
                System.out.println("Digite seu nome maiusculo");
                nomeMaiusculo = sc.nextLine();

                System.out.println(nomeminusculo.equalsIgnoreCase(nomeMaiusculo));
    }
}
