package org.example.petshop;

import java.util.Scanner;

public class MainAtividade4Petshop {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                // Criando a instância do objeto Pet
                Pet meuPet = new Pet();

                // Leitura guardando DIRETO dentro do objeto
                System.out.print("Nome do pet: ");
                meuPet.setNome(sc.nextLine());

                System.out.print("Espécie: ");
                meuPet.setEspecie(sc.nextLine());

                System.out.print("Peso (kg): ");
                meuPet.setPeso(sc.nextDouble());

                // Lógica de negócio guardando o porte no objeto
                if (meuPet.getPeso() < 10) {
                    meuPet.setPorte("Pequeno");
                } else if (meuPet.getPeso() < 25) {
                    meuPet.setPorte("Médio");
                } else {
                    meuPet.setPorte("Grande");
                }

                // Impressão da ficha lendo do objeto
                System.out.println("\n=== FICHA DO PET ===");
                System.out.println("Nome: " + meuPet.getNome());
                System.out.println("Espécie: " + meuPet.getEspecie());
                System.out.printf("Peso: %.1f kg\n", meuPet.getPeso());
                System.out.println("Porte: " + meuPet.getPorte());
    }
}
