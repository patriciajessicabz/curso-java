package org.example.aula2;

public class ExerciciosAritmeticosDesafio {
    static void main() {
        //  Crie uma variável com 3785 segundos. Mostre quantos minutos inteiros isso dá e quantos segundos sobram.

        int segundos = 3785;

        int minutos = segundos / 60;
        int restoSegundos = segundos % 60;

        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos restantes: " + restoSegundos);
    }
}
