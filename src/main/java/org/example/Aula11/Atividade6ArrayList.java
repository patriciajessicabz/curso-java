package org.example.Aula11;
//- Crie uma lista com cinco nomes. Peça um nome à pessoa e diga se ele
// está na lista e em qual posição. Se não estiver, avise.
import java.util.ArrayList;
import java.util.Scanner;

public class Atividade6ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();

        lista.add("João");
        lista.add("Maria");
        lista.add("Ravi");
        lista.add("Angela");
        lista.add("Hadassa");

        System.out.println("Digite um nome: ");
        String NomeDigitado = sc.nextLine();

        if (lista.contains(NomeDigitado)) {
            int posicao = lista.lastIndexOf(NomeDigitado);
            System.out.println(" Está na lista, na posição: " + posicao);
        } else {
            System.out.println(" Não foi encontrado na lista! ");
        }





    }
}
