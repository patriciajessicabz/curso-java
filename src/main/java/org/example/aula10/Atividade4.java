package org.example.aula10;
//4 — Crie uma variável String nome = null; e tente imprimir nome.length().
// Trate a NullPointerException e mostre "O nome não foi preenchido."
public class Atividade4 {
    public static void main(String[] args) {

        String nome = null;

                try {
                    System.out.println(nome.length());

                } catch (NullPointerException e){
                    System.out.println("O nome não foi preenchido.");
                }
    }

}
