package org.example.aula7;
//2 — Peça o nome da pessoa e mostre ele todo em MAIÚSCULO e todo em minúsculo.
import java.util.Scanner;

public class Atividade2Strings {
    static void main() {
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
