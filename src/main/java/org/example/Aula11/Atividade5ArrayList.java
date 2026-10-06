package org.example.Aula11;

import java.util.ArrayList;

//- Crie uma lista com seis nomes e imprima todos usando um laço, no formato `"0: Ana"`.
// (Dica: i + ": " + comando para pegar posição da lista)
public class Atividade5ArrayList {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Maria");
       lista.add("Julia");
       lista.add("Vládia");
        lista.add("Thais");
        lista.add("Felipe");
        lista.add("Renato");

        for (int i = 0; i < lista.size(); i++){

            System.out.println(i + " : " + lista.get(i));

        }



    }
}
