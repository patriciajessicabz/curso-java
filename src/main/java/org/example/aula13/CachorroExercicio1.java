package org.example.aula13;
//1. Crie uma interface Animal com o método emitirSom().
//   Crie a classe Cachorro que implementa ela e imprime "Au au!".
//   Na Main, crie um cachorro e chame o método. Não esqueça do @Override.
public class CachorroExercicio1 implements Exercicio1Animal {

        @Override
        public void emitirSom() {
            System.out.println("Au au!");
        }

    }


