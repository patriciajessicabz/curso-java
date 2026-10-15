package org.example.aula13;
//1. Crie um array (não arrayList, array normal) com 4 nomes e imprima todos usando for-each,
//   um por linha.
public class Atividade1ForEach {
    public static void main(String[] args) {

        String[] nomes = {"Maria", "João", "José", "Bia"};

        for (String nome : nomes ){
            System.out.println(nome);
        }

    }
}
