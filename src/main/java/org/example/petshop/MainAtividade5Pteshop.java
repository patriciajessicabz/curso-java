package org.example.petshop;

import java.util.Scanner;

public class MainAtividade5Pteshop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pet meuPet = new Pet();

        System.out.print("Nome do pet: ");
        meuPet.nome = sc.nextLine();

        System.out.print("Espécie: ");
        meuPet.especie = sc.nextLine();

        System.out.print("Peso (kg): ");
        meuPet.peso = sc.nextDouble();

        // Chamada do método que calcula o porte em uma única linha
        meuPet.porte = meuPet.definirPorte();

        // Impressão da ficha
        System.out.println("\n=== FICHA DO PET ===");
        System.out.println("Nome: " + meuPet.nome);
        System.out.println("Espécie: " + meuPet.especie);
        System.out.printf("Peso: %.1f kg\n", meuPet.peso);
        System.out.println("Porte: " + meuPet.porte);
    }
}
