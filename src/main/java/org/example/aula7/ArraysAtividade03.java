package org.example.aula7;
//3 — Com o mesmo array de notas, calcule e mostre a soma e a média.
public class ArraysAtividade03 {
    static void main(String[] args) {

        int [] notas = {8, 6, 10, 7, 9};

        int soma = 0;

        for (int i = 0; i < notas.length; i++){
            soma = soma + notas[i];
        }
        double media = (double) soma / notas.length;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}
