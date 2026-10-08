package org.example.aula12;

import java.util.ArrayList;
import java.util.HashSet;

//3. Crie um ArrayList com nomes repetidos. Use new HashSet<>(lista) para
//   tirar os repetidos. Imprima os dois e compare.
public class Atividade3Hashset {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Ana");
        lista.add("José");
        lista.add("Maria");
        lista.add("Ana");
        lista.add("José");

        HashSet<String> semRepetidos = new HashSet<>(lista);

        System.out.println("Com repetidos: " + lista);
        System.out.println("Sem repetidos: "+ semRepetidos);




    }
}
