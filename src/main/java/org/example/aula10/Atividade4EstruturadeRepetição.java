package org.example.aula10;
//4 -  Crie uma variável com um número e mostre a tabuada dele de 1 a 10.
public class Atividade4EstruturadeRepetição {
    static void main(String[] args) {
        int numero = 7;

        for (int i = 1; i <= 10; i++){
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

    }
}
