package org.example.aula08;

import java.util.Scanner;

//4 — Crie um método calcularMedia(double n1, double n2) que devolve a média das duas notas. No main,
// peça as duas notas com Scanner e mostre a média com duas casas decimais.
public class Atividade4Metodos {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = Utilidades.calcularMedia(nota1, nota2);

        System.out.printf("A média é: %.2f\n", media);



    }

}
