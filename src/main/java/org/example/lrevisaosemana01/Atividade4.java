package org.example.lrevisaosemana01;

public class Atividade4 {
    public static void main(){

        Pet4 cachorro = new Pet4();
        cachorro.nome = "Mousse";
        cachorro.raca = "Pinscher";
        cachorro.peso = 2.5;

        Pet4 gato = new Pet4();
        gato.nome = "Mingau";
        gato.raca = "Persa";
        gato.peso = 4.0;

        System.out.println("Nome: " + cachorro.nome + ", Raça: " + cachorro.raca + ", Peso: " + cachorro.peso + " kg");
        System.out.println("Nome: " + gato.nome + ", Raça: " + gato.raca + ", Peso: " + gato.peso + " kg");
    }
}
