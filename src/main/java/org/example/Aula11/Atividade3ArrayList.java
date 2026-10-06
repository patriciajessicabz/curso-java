package org.example.Aula11;

import java.util.ArrayList;
import java.util.List;

//- Crie uma lista com quatro nomes. Troque o nome da posição 2 por outro e imprima a lista antes e depois.
public class Atividade3ArrayList {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Ana");
        lista.add("Julia");
        lista.add("Carlos");
        lista.add("João");

        System.out.println(lista);
        lista.set(2,"Marina");
        System.out.println(lista);




    }
}
