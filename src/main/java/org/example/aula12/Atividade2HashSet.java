package org.example.aula12;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

//2. Crie um HashSet de cores usando addAll. Depois use contains dentro
//   de um if para avisar se a cor "verde" já está no conjunto ou não.
public class Atividade2HashSet {
    public static void main(String[] args) {

        Set<String> cores = new HashSet<>();

        cores.addAll(List.of("Azul", "Amarelo", "Branco"));

        if (cores.contains("Verde")) {
            System.out.println("A cor verde já está no conjunto! ");
        } else {
            System.out.println(" A cor verde não está no conjunto! ");
        }



    }
}
