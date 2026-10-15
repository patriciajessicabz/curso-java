package org.example.aula13;

import java.util.HashMap;

//2. Crie um HashMap de produtos e preços. Coloque "café" com valor 5.00,
//   imprima, e depois faça put de "café" DE NOVO com valor 7.50.
//   Imprima outra vez e veja o que aconteceu com o tamanho.
public class Atividade2HashMap {
    public static void main(String[] args) {

        HashMap<String, Double> produtos = new HashMap<>();

        produtos.put("Arroz", 8.50);
        produtos.put("Café", 5.00);
        produtos.put("Leite", 7.50);
        produtos.put("Feijão", 11.20);

        produtos.put("Café", 5.00);

        System.out.println("Produtos: " + produtos);
        System.out.println("Tamanho: " + produtos.size());

        produtos.put("Café", 7.50);

        System.out.println("Produtos atualizados: " + produtos);
        System.out.println("Tamanho final: " + produtos.size());




    }
}
