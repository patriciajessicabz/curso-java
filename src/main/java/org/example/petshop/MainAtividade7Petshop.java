package org.example.petshop;

import java.util.Scanner;

public class MainAtividade7Petshop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Petshop petshop = new Petshop();
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== PETSHOP ===");
            System.out.println("1 - Cadastrar pet");
            System.out.println("2 - Listar pets");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine(); // Limpa o buffer
            switch (opcao) {
                case 1:
                    Pet novoPet = new Pet();
                    System.out.print("Nome do pet: ");
                    novoPet.setNome(sc.nextLine());

                    System.out.print("Espécie: ");
                    novoPet.setEspecie(sc.nextLine());

                    System.out.print("Peso (kg): ");
                    novoPet.setPeso(sc.nextDouble());
                    sc.nextLine();

                    novoPet.setPorte(novoPet.definirPorte());
                    System.out.println("Porte: " +  novoPet.getPorte());

                    if(petshop.cadastrarPet(novoPet)){
                        System.out.println("Pet cadastrado com sucesso!");
                    }else{
                        System.out.println("Limite de pets atingido!");
                    }
                    break;

                    case 2:
                        System.out.println("\n--- PETS CADASTRADOS ---");
                        if (petshop.getTotal() == 0) {
                            System.out.println("Nenhum pet cadastrado.");
                        } else {
                            for (int i = 0; i < petshop.getTotal(); i++) {
                                Pet pet = petshop.getPet(i);
                                System.out.println("Nome: " + pet.getNome());
                                System.out.println("Especie: " + pet.getEspecie());
                                System.out.println("Peso: " + pet.getPeso());
                                System.out.println("Porte: " + pet.getPorte());
                            }
                        }
                        break;

                    case 0:
                        System.out.println("Até logo!");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                }
        }


    }
}
