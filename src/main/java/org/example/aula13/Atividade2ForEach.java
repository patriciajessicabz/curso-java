package org.example.aula13;

import java.util.ArrayList;

//2. Crie um ArrayList com 5 notas e imprima todas usando for-each.
public class Atividade2ForEach {
    public static void main(String[] args) {

        ArrayList<Integer> notas = new ArrayList<>();

        notas.add(8);
        notas.add(5);
        notas.add(7);
        notas.add(9);
        notas.add(6);

        for (Integer nota : notas) {
            System.out.println(nota);
        }
    }

}
