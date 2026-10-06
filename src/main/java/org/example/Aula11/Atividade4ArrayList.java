package org.example.Aula11;

import java.util.ArrayList;

//- Crie uma lista com quatro cidades. Remova a da posição 1 e imprima quantas sobraram.
public class Atividade4ArrayList {
   public static void main(String[] args) {

       ArrayList<String> lista = new ArrayList<>();

       lista.add("Manaus");
       lista.add("Fortaleza");
       lista.add("Recife");
       lista.add("Curitiba");

       System.out.println("lista Inicial: " + lista);

       lista.remove(1);
       System.out.println("Lista após a remoção: " + lista);

       System.out.println("Quantas Sobraram: " + lista.size());



    }
}
