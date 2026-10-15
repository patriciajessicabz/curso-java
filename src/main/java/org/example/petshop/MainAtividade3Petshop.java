package org.example.petshop;

import java.util.Scanner;

public class MainAtividade3Petshop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Petshop meuPet = new Petshop();

        System.out.print("Nome do pet: ");
        meuPet.nome = sc.nextLine();

        System.out.print("Espécie: ");
        meuPet.especie = sc.nextLine();

        System.out.print("Peso (kg): ");
        meuPet.peso = sc.nextDouble();

        String porte;
        if (meuPet.peso < 10) {
            porte = "Pequeno";
        } else if (meuPet.peso < 25) {
            porte = "Médio";
        } else {
            porte = "Grande";
        }

        System.out.println("\n=== FICHA DO PET ===");
        System.out.println("Nome: " + meuPet.nome);
        System.out.println("Espécie: " + meuPet.especie);
        System.out.printf("Peso: %.1f kg\n", meuPet.peso);
        System.out.println("Porte: " + porte);

    }
}
