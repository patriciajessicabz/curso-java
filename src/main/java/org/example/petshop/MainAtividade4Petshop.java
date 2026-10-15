package org.example.petshop;

import java.util.Scanner;

public class MainAtividade4Petshop {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                // Criando a instância do objeto Pet
                Pet meuPet = new Pet();

                // Leitura guardando DIRETO dentro do objeto
                System.out.print("Nome do pet: ");
                meuPet.nome = sc.nextLine();

                System.out.print("Espécie: ");
                meuPet.especie = sc.nextLine();

                System.out.print("Peso (kg): ");
                meuPet.peso = sc.nextDouble();

                // Lógica de negócio guardando o porte no objeto
                if (meuPet.peso < 10) {
                    meuPet.porte = "Pequeno";
                } else if (meuPet.peso < 25) {
                    meuPet.porte = "Médio";
                } else {
                    meuPet.porte = "Grande";
                }

                // Impressão da ficha lendo do objeto
                System.out.println("\n=== FICHA DO PET ===");
                System.out.println("Nome: " + meuPet.nome);
                System.out.println("Espécie: " + meuPet.especie);
                System.out.printf("Peso: %.1f kg\n", meuPet.peso);
                System.out.println("Porte: " + meuPet.porte);
    }
}
