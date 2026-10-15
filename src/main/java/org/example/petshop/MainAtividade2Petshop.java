package org.example.petshop;

import java.util.Scanner;

public class MainAtividade2Petshop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Instanciando o objeto da classe Pet
        Petshop meuPet = new Petshop();

        System.out.print("Nome do pet: ");
        meuPet.nome = sc.nextLine();

        System.out.print("Espécie: ");
        meuPet.especie = sc.nextLine();

        System.out.print("Peso (kg): ");
        meuPet.peso = sc.nextDouble();

        // Impressão da ficha do pet
        System.out.println("\n=== FICHA DO PET ===");
        System.out.println("Nome: " + meuPet.nome);
        System.out.println("Espécie: " + meuPet.especie);
        System.out.printf("Peso: %.1f kg%n", meuPet.peso);




    }
}
