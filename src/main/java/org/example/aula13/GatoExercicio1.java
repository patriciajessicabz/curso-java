package org.example.aula13;
//2. Agora acrescente a classe Gato, que implementa a mesma interface e
//  imprime "Miau!". Na main, declare as duas variáveis como Animal:
// Animal bidu = new Cachorro();
//  Animal salem= new Gato();
// Chame emitirSom() nas duas.
public class GatoExercicio1 implements Exercicio1Animal {

    @Override
    public void emitirSom(){
        System.out.println("Miau!");
    }
}
