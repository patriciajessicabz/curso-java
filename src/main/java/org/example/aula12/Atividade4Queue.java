package org.example.aula12;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//4. Crie uma fila com três nomes e atenda todos usando
//   while (!fila.isEmpty()). No final, imprima "Fila vazia!".
public class Atividade4Queue {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.addAll(List.of("Julia", "Jéssica", "Renato"));

        while (!fila.isEmpty()) {
            String pessoa = fila.poll();
            System.out.println("Atendendo: " + pessoa);
        }

            System.out.println("Fila vazia!");

        }


    }
