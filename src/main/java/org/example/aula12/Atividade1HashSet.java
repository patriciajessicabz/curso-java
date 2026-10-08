package org.example.aula12;

import java.util.HashSet;

//1. Crie um HashSet de nomes e adicione quatro valores, sendo um deles
//   repetido. Imprima o conjunto e o tamanho. Repare no que aconteceu
//   com o repetido.
public class Atividade1HashSet {
    public static void main(String[] args) {

        HashSet<String> nomes = new HashSet<>();

        nomes.add("Lara");
        nomes.add("Bia");
        nomes.add("Julia");
        nomes.add("Lara");

        // Imprime o conjunto
        System.out.println("Nome: " + nomes);

        // Imprime o tamanho
        System.out.println("Nomes: " + nomes.size());



    }
}
