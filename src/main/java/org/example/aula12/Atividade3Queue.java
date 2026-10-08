package org.example.aula12;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//3. Mesma fila. Agora use poll para atender o primeiro e imprima a fila
//   depois. Compare com o exercício 2.
public class Atividade3Queue {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.addAll(List.of("Maria", "Juliana", "Renato"));

        String atendido = fila.poll();
        System.out.println("Pessoa atendida (poll): " + atendido);

        System.out.println("Fila após o poll: " + fila);

        // Comparando com a atividade 2.
        // peek() é só consultar: "Quem é o próximo?" (ninguém sai da fila).
        // poll() é atender: "Próximo!" (o primeiro é chamado e sai da fila).
    }
}
