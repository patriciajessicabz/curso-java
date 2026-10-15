package org.example.aula13;

import java.util.HashMap;

//5. Crie um HashMap de notas com três alunas. Imprima o mapa e o tamanho.
//   Remova uma delas e imprima de novo.
public class Atividade5HashMap {
    public static void main(String[] args) {

        HashMap<String, Double> notas = new HashMap<>();

        notas.put("Maria", 5.6);
        notas.put("Julia", 7.5);
        notas.put("Ana", 8.0);

        System.out.println(notas);

        System.out.println(notas.size());

        notas.remove("Maria");
        System.out.println(notas);

        System.out.println(notas.size());

    }
}
