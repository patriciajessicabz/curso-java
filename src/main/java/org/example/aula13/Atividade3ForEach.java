package org.example.aula13;
//3. Com o array de notas {8, 6, 10, 7}, use for-each para somar
//   todas e mostrar a soma e a média.
public class Atividade3ForEach {
    public static void main(String[] args) {

        int [] notas = {8, 6, 10, 7};

        int soma = 0;

        for (int nota : notas) {
            soma = soma + nota;
        }

            double media = (double) soma / notas.length;

            System.out.println("Soma: " + soma);
            System.out.println("Média: " + media);



    }
}
