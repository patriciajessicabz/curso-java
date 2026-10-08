package org.example.aula12;

import java.util.LinkedList;
import java.util.Queue;

//6. Crie uma fila vazia. Antes de usar o peek, teste com isEmpty():
//   - se estiver vazia  -> "Não tem ninguém na fila."
//   - se tiver gente    -> "Próximo: [nome]"
//   Depois adicione uma pessoa e teste de novo.
public class Atividade6Queue {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        if (fila.isEmpty()) {
            System.out.println("Não tem ninguém na fila.");

        } else {
            System.out.println("Proximo: " + fila.peek());

        }
        fila.add("Joana");

        if (fila.isEmpty()) {
            System.out.println("Não tem ninguém na fila.");
        } else{
                System.out.println("Proximo: " + fila.peek());
            }
            }
        }



