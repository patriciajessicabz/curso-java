package org.example.aula12;

import java.util.HashSet;

//4. Crie um HashSet com três CPFs e imprima. Depois remova um deles e
//   imprima de novo, junto com o tamanho.
public class Atividade4HashSet {
    public static void main(String[] args) {

        HashSet<String> cpfs = new HashSet<>();

        cpfs.add("222.454.666-12");
        cpfs.add("111.666.444-11");
        cpfs.add("222.777.888-44");

        System.out.println("CPFs iniciais: " + cpfs);

        cpfs.remove("222.454.666-12");

        System.out.println("Após a remoção: " + cpfs);
        System.out.println("Tamanho atual: " + cpfs.size());


    }
}
