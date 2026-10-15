package org.example.aula13;
//5. Pegue o exercício 1 e escreva ele DE NOVO com o for normal,
//   usando o índice. Deixe os dois na mesma classe e compare.
public class Atividade5ForEach {
    public static void main(String[] args) {

        String[] nomes = {"Maria", "João", "José", "Bia"};

        System.out.println("FOR-EACH:");

        for (String nome : nomes ){
            System.out.println(nome);
        }

        System.out.println("\nFOR NORMAL:");

        for (int i= 0; i< nomes.length; i++){
            System.out.println(nomes[i]);
        }

        //Os dois percorreram o array inteiro, mas o for normal usa índice, sabe a posição de cada nome,
        // e o for-each não precisa de índice, sendo mais simples, mas não me entrega a posição.

    }
}
