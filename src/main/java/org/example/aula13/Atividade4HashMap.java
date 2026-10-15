package org.example.aula13;

import java.util.HashMap;

//4. Crie um HashMap de estoque (produto -> quantidade) com dois itens.
//   Use getOrDefault para mostrar a quantidade de um produto que existe
//   e de um que não existe (devolvendo 0). Depois tente com get normal
//   no que não existe e compare.
public class Atividade4HashMap {
    public static void main(String[] args) {

        HashMap<String, Integer> estoque = new HashMap<>();

        estoque.put("Maçã", 10);
        estoque.put("Banana", 5);

        System.out.println("Maçã: " + estoque.getOrDefault("Maçã", 10));

        System.out.println("Pera: " + estoque.getOrDefault("Pera", 0));

        System.out.println("Pera usando get(): " + estoque.get("Pera"));



    }
}
