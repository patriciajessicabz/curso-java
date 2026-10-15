package org.example.petshop;

public class MainAtividade1Petshop {
    public static void main(String[] args) {

        String nome = "Mel";
        String especie = "Cachorro";
        double peso = 8.5;

        // Impressão da ficha do pet
        System.out.println("=== FICHA DO PET ===");
        System.out.println("Nome: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.printf("Peso: %.1f kg%n", peso);

    }
}
