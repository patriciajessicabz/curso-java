package org.example.aula12;

import java.util.HashSet;

//5. Crie um HashSet com três frutas e percorra ele com for,
//   imprimindo uma por linha.
public class Atividade5HashSet {
    public static void main(String[] args) {

        HashSet<String> frutas = new HashSet<>();

        frutas.add("Uva");
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Goiaba");

        for (String fruta : frutas);{
            System.out.println(frutas);
        }


    }
}
