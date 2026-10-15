package org.example.aula13;
//4. Com um array de nomes, use for-each e um if para contar quantos
//   têm mais de 5 letras. Mostre o total. Dica: usem o método length.
public class Atividade4ForEach {
    public static void main(String[] args) {

        String[] nomes = {"Maria", "Juliana", "Julia", "Renato"};

        int contador = 0;

        for (String nome : nomes){
            if (nome.length() > 5){
                contador++;
            }

        }
        System.out.println("Total: " + contador);
    }
}
