package org.example.aula12;

import java.util.HashSet;

//6. Crie um HashSet vazio. Imprima o isEmpty(). Adicione um valor e
//   imprima o isEmpty() de novo.
public class Atividade6HashSet {
    public static void main(String[] args) {

        HashSet<String> conjunto = new HashSet<>();

        System.out.println("Está vazio? " + conjunto.isEmpty());

        conjunto.add("Olá!");

        System.out.println("E agora, está vazio? " + conjunto.isEmpty());
    }
}
