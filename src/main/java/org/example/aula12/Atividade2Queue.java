package org.example.aula12;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//2. Crie uma fila com addAll. Use peek para mostrar quem é o próximo e
//   imprima a fila logo depois. Repare que ela não mudou.
public class Atividade2Queue {
    public static void main(String[] args) {
        //Criar a fila
        Queue<String> fila = new LinkedList<>();

        //Adicionar vários elementos com addAll
        fila.addAll(List.of("Maria", "Juliana", "Renato"));

        //Espreitar quem é o próximo com peek()
        System.out.println("Próximo da fila (peek): " + fila.peek() );

        System.out.println("Fila após o peek: " + fila);



    }
}
