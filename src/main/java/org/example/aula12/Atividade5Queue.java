package org.example.aula12;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//5. Crie uma fila com três nomes e use contains para responder duas
//   perguntas: se "Bia" está na fila e se "Zoe" está.
public class Atividade5Queue {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.addAll(List.of("Julia", "Bia", "Maria"));

        System.out.println("Bia está na fila? " + fila.contains("Bia"));

        System.out.println("Zoe está na fila? " + fila.contains("Zoe"));


    }
}
