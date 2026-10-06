package org.example.Aula11;

import java.util.ArrayList;
import java.util.List;

//- Crie uma lista já preenchida com quatro frutas. Imprima a primeira, a última e quantas frutas tem.
public class Atividade2ArrayList {
    public static void main(String[] args) {

        ArrayList<String> frutas = new ArrayList<>(List.of("Banana", "Maçã", "uva", "Laranja"));

        System.out.println(frutas.get(0));
        System.out.println(frutas.get(3));
        System.out.println(frutas.size());



    }
}
