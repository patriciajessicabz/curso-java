package org.example.petshop;

import java.util.Scanner;

public class MainAtividade6Petshop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Criar o array de Pets com capacidade para 5 elementos
        Pet[] listaDePets = new Pet[5];

        // 2. Instanciar o primeiro pet e preencher os dados
        Pet meuPet = new Pet();

        System.out.print("Nome do pet: ");
        meuPet.nome = sc.nextLine();

        System.out.print("Espécie: ");
        meuPet.especie = sc.nextLine();

        System.out.print("Peso (kg): ");
        meuPet.peso = sc.nextDouble();

        // Calcular o porte
        meuPet.porte = meuPet.definirPorte();

        // 3. Guardar o pet na primeira posição (índice 0) do array
        listaDePets[0] = meuPet;

        // 4. Imprimir os dados buscando direto da posição 0 do array
        System.out.println("\n--- PETS CADASTRADOS ---");
        System.out.printf("%s (%s) - %.1f kg - Porte %s\n",
                listaDePets[0].nome,
                listaDePets[0].especie,
                listaDePets[0].peso,
                listaDePets[0].porte);

    }
}
