package org.example.aula08;

import java.util.Scanner;

//5 — Crie um método ehMaiorDeIdade(int idade) que devolve true ou false. No main, peça a idade
// e use o retorno do método dentro de um if para imprimir se a pessoa é maior ou menor de idade.
public class Atividade5Metodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite sua idade: ");
        int idade = sc.nextInt();

        if (Utilidades.ehMaiorDeIdade(idade)) {
            System.out.println("É maior de idade. ");
        } else {
            System.out.println("É menor de idade. ");
        }

    }
}
