package org.example.aula2concatenacao;

public class ExerciciosConcatenacao2 {
    static void main() {
        //2 — Crie variáveis para o nome de um produto ("Caneca"),
        // o preço (12.50) e a quantidade (4). Mostre:
        // "Comprei 4 unidades de Caneca por R$ 12.5 cada. Total: R$ 50.0"

        String nome = "Caneca";
        double preco = 12.5;
        int quantidade = 4;
        double total = 50;

        System.out.println("Comprei " + quantidade + " unidades de " + nome +
                " por R$ " + preco + " cada. Total: R$ " + total);

    }
}
