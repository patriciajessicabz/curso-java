package org.example.petshop;

import java.util.Scanner;

public class MainAtividade2Petshop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Instanciando o objeto da classe Pet
        Pet meuPet = new Pet();

        System.out.print("Nome do pet: ");
        meuPet.setNome(sc.nextLine());

        System.out.print("Espécie: ");
        meuPet.setEspecie(sc.nextLine());

        System.out.print("Peso (kg): ");
        meuPet.setPeso(sc.nextDouble());

        meuPet.setPorte(meuPet.definirPorte());

        // Impressão da ficha do pet
        System.out.println("\n=== FICHA DO PET ===");
        System.out.println("Nome: " + meuPet.getNome());
        System.out.println("Espécie: " + meuPet.getEspecie());
        System.out.printf("Peso: %.1f kg%n", meuPet.getPeso());
        System.out.println("Porte: " + meuPet.getPorte());




    }
}
