package org.example.aula12;
/*
        .add("Ana");
        .peek();
        .poll();
        .isEmpty();
        .size();
        .contains("Bia");
        .addAll(List.of("Ana","Bia"));
        */
import java.util.ArrayDeque;
import java.util.List;

public class AulaQueue {
    public static void main(String[] args) {

        ArrayDeque<String> fila = new ArrayDeque<>();
        fila.add("Flora");
        fila.add("Ana");
        fila.addAll(List.of("Maria", "Natália", "Kerou", "Giovanna"));

        System.out.println(fila);

    }


}
