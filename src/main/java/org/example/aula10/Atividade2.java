package org.example.aula10;

import java.util.Scanner;
//2 — Crie um array com 5 notas. Peça uma posição para a pessoa e mostre a nota daquela posição.
// Se a posição não existir, trate a ArrayIndexOutOfBoundsException e avise que o array só vai de 0 a 4.
public class Atividade2 {
    public static void main(String[] args) {

        int[] notas = {5,4,7,6,9};
        Scanner sc = new Scanner(System.in);

        System.out.println(" Digite uma posição entre 0 e 4: ");

        try {

            int posicao = sc.nextInt();
            System.out.println("A nota na posição " + posicao  +  " é:" + notas[posicao]);
        }catch (ArrayIndexOutOfBoundsException e){
            // Trata o erro de índice fora dos limites do array (ex: menor que 0 ou maior que 4).
            System.out.println("Erro: A posição digitada é inválida! O array só aceita posições de 0 a 4.");





        }

    }

}
