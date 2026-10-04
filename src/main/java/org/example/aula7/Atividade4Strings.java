package org.example.aula7;
//4 — Peça uma frase e uma palavra. Diga se a palavra aparece dentro da frase.
//Digite uma frase: Estou aprendendo Java
//Digite uma palavra: Java
//A palavra aparece na frase? true
import java.util.Scanner;

public class Atividade4Strings {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();

        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();

        // verifica se a palavra aparece dentro da frase
        boolean resultado = frase.contains(palavra);

        System.out.println("A palavra aparece na frase? " + resultado);
    }
}
