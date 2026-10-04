package org.example.aula7;
//1 — Peça o nome completo da pessoa e mostre quantas letras ele tem (contando os espaços).
import java.util.Scanner;

public class Atividade1Strings {
    public static void main() {
        //1 — Peça o nome completo da pessoa e mostre quantas letras ele tem (contando os espaços).

        Scanner scanner= new Scanner(System.in);

        System.out.println("Digite seu nome completo:");
        String nome= scanner.nextLine(); // ler o nome digitado...
        int quantidade = nome.length(); // conta a quantidade...

        System.out.println("Seu nome completo tem " + quantidade + " caracteres (incluindo espaços).");

    }
}
