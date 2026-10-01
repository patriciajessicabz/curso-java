package org.example.aula2aritimeticos;

public class ExerciciosAritmeticos {
    static void main() {
        // 0- Rode esse código:
        //System.out.println("2 + 2 = " + 2 + 2);.
        //Agora rode:
        // System.out.println("2 + 2 = " + (2 + 2));
        //Explique em um comentário por que deram resultados diferentes.

        System.out.println("2 + 2 = " + 2 + 2);
        System.out.println("2 + 2 = " + (2 + 2));

        // No primeiro exemplo o Java concatena os números como texto, resultando em "22".
        // No segundo exemplo, os parênteses obrigam o Java a calcular a soma antes de concatenar, resultando em "4"
        /* Resumindo: sem parênteses, o Java trata os números como texto e apenas junta; com parênteses, ele faz a conta primeiro
        e depois transforma em texto.
         */

    }
}
