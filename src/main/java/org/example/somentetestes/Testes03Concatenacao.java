package org.example.somentetestes;

public class Testes03Concatenacao {
    static void main() {
        // Exemplo Mercado
        // System → classe do Java.
        // out → saída padrão (console).
        // println() → imprime uma linha e pula para a próxima.
        // "=== MERCADO ===" → texto que será exibido.
        // O \n significa "quebra de linha" (new line).
        //O \n faz o cursor pular uma linha antes de escrever o texto.


        String produto1 = "Arroz";
        double preco1 = 25.90;
        int quantidade1 = 3;

        String produto2 = "Feijão";
        double preco2 = 8.50;
        int quantidade2 = 2;

        String produto3 = "Macarrão";
        double preco3 = 5.99;
        int quantidade3 = 4;

        double total1 = preco1 * quantidade1;
        double total2 = preco2 * quantidade2;
        double total3 = preco3 * quantidade3;

        double totalCompra = total1 + total2 + total3;

        System.out.println("=== MERCADO ===");

        System.out.println("\nProduto: " + produto1);
        System.out.println("Cálculo: " + preco1 + " * " + quantidade1 + " = " + total1);

        System.out.println("\nProduto: " + produto2);
        System.out.println("Cálculo: " + preco2 + " * " + quantidade2 + " = " + total2);

        System.out.println("\nProduto: " + produto3);
        System.out.println("Cálculo: " + preco3 + " * " + quantidade3 + " = " + total3);

        System.out.println("\nTotal da compra: R$ " + totalCompra);

    }
}
