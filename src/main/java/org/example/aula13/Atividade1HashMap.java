package org.example.aula13;

import java.util.HashMap;
import java.util.Map;

//1. Crie um HashMap de nomes e idades com três pessoas. Imprima o mapa
//   inteiro e depois use get para mostrar a idade de uma delas.
public class Atividade1HashMap {
    public static void main(String[] args) {

        HashMap<String, Integer> mapa = new HashMap<>();

        mapa.put("Lara", 16);
        mapa.put("Sofia", 14);
        mapa.put("Julia", 10);

        System.out.println("Pessoas: " + mapa);

        System.out.println("Idade da Sofia: " + mapa.get("Sofia"));

    }
}
