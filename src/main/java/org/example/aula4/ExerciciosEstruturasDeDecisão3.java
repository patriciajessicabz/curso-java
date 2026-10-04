package org.example.aula4;

public class ExerciciosEstruturasDeDecisão3 {
    static void main() {
        /* 3 — Crie uma variável opcao com um número de 1 a 4 e, usando switch, mostre o pedido escolhido no cardápio:
         1 é Café, 2 é Cappuccino, 3 é Chocolate quente e 4 é Chá. Qualquer outro número mostra "Opção inválida".
         */

        int opcao = 2;

        if (opcao == 1) {
            System.out.println("Café");
        } else if (opcao == 2) {
            System.out.println("Cappuccino");
        } else if (opcao == 3) {
            System.out.println("Chocolate quente");
        } else if (opcao == 4) {
            System.out.println("Chá");
        } else {
            System.out.println("Opção inválida");
        }
    }
}
