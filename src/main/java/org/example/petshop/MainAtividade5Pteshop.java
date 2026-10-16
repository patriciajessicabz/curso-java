package org.example.petshop;

import java.util.Scanner;

public class MainAtividade5Pteshop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pet meuPet = new Pet();

        System.out.print("Nome do pet: ");
        meuPet.setNome(sc.nextLine());

        System.out.print("Espécie: ");
        meuPet.setEspecie(sc.nextLine());

        System.out.print("Peso (kg): ");
        meuPet.setPeso(sc.nextDouble());

        // Chamada do método que calcula o porte em uma única linha
        meuPet.setPorte(meuPet.definirPorte());

        // Impressão da ficha
        System.out.println("\n=== FICHA DO PET ===");
        System.out.println("Nome: " + meuPet.getNome());
        System.out.println("Espécie: " + meuPet.getEspecie());
        System.out.printf("Peso: %.1f kg\n", meuPet.getPeso());
        System.out.println("Porte: " + meuPet.getPorte());
    }
}
