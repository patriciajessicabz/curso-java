package org.example.aula13;

import java.util.HashMap;

//3. Crie uma agenda (nome -> telefone) com duas pessoas. Use containsKey
//   dentro de um if para mostrar o telefone de alguém que está na agenda
//   e de alguém que não está.
public class Atividade3HashMap {
    public static void main(String[] args) {

        HashMap<String, String> agenda = new HashMap<>();

        agenda.put("Nome1", "00 0000 000 00");
        agenda.put("Nome2", "11 1111 222 11");

        if (agenda.containsKey("Nome1")) {
            System.out.println("Telefone de Nome1: " + agenda.get("Nome1"));
        } else {
            System.out.println("Contado Nome1 não encontrado. ");
        }

        if (agenda.containsKey("NomeDesconhecido")) {
            System.out.println("Telefone: " + agenda.get("NomeDesconhecido"));
        }else {
            System.out.println("Contado NomeDesconhecido não encontrado. ");
        }


    }
}
