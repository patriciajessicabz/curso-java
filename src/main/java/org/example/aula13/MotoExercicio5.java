package org.example.aula13;

public class MotoExercicio5 implements VeiculoExercicio5 {

    @Override
    public void ligar(){
        System.out.println("Moto ligada!");
    }

    @Override
    public void acelerar (){
        System.out.println("Moto acelerando!");
    }
}
