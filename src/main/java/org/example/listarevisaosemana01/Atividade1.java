package org.example.listarevisaosemana01;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o nome do lanche: ");
        String nome = sc.nextLine();

        System.out.print("Digite o valor do lanche: ");
        double valor = sc.nextDouble();

        // Verificação e desconto
        if (valor > 30.00) {
            valor -= 5.00;
        }

        // Saída formatada
        System.out.println("O lanche " + nome + " custa R$ " + String.format("%.2f", valor));
        System.out.printf("O lanche %s custa R$ %.2f%n", nome, valor);

        }
}





