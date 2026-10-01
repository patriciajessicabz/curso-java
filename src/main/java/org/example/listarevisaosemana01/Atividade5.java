package org.example.listarevisaosemana01;

import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {

            System.out.print("Digite o nome do produto: ");
            String nome = sc.nextLine();

            System.out.print("Digite o preço do produto: ");
            double preco = sc.nextDouble();
            sc.nextLine();

            Produto5 produto = new Produto5();
            produto.nome = nome;
            produto.preco = preco;

            if (produto.preco > 100) {
                System.out.println("Produto caro!");
            } else {
                System.out.println("Produto com preço acessível!");
            }

            System.out.printf("Produto: %s - R$ %.2f%n",
                    produto.nome, produto.preco);
        }

    }
}

