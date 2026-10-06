package org.example.Aula11;

import java.util.ArrayList;
import java.util.List;


public class ArrayListAula {
   public static void main(String[] args) {

       /*.add();
        .get();
        .size();
        .contains();
        .indexOf();
        .remove();
        .set();
        .isEmpty();
        .addAll(List.of());*/

       ArrayList<Integer> lista = new ArrayList<>();
       // ArrayList<Integer> lista = new ArrayList<>(List.of(1,2,3));

       lista.add(1);
       lista.add(10);
       lista.add(100);
       lista.add(1000);

       lista.addAll(List.of(1,2,35,6,765,234,9)); // adiciona vários valores

       System.out.println(lista);
       lista.remove(1);
       lista.remove(3);    //index-posição
       System.out.println(lista);
       System.out.println(lista.get(2));  //get-pega-posição

       lista.set(1,98);   // acessa a posição e modifica
       System.out.println(lista);
       System.out.println(lista.size()); //tamanho

       System.out.println(lista.contains(98));   // Contains é o valor e não a posição
       System.out.println(lista.indexOf(98));  // vai dizer qual a posição do valor
       System.out.println(lista.isEmpty()); //está vazia?




    }

}
