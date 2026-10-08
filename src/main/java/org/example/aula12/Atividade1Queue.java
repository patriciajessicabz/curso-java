package org.example.aula12;

import java.util.LinkedList;
import java.util.Queue;

//1. Crie uma fila e coloque três pessoas nela com add. Imprima a fila
//   e quantas pessoas tem.
public class Atividade1Queue {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // Adicionar 3 pessoas
        fila.add("Maria");
        fila.add("Juliana");
        fila.add("Renato");

        //Imprimir a fila inteira
        System.out.println("Fila atual: " + fila);

        // Imprimir a quantidade de pessoas (.size())
        System.out.println("Quantidade de pessoas na fila: " + fila.size());

    }

}
