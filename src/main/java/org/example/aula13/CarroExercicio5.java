package org.example.aula13;

public class CarroExercicio5 implements VeiculoExercicio5 {

    @Override
    public void ligar(){
        System.out.println("Carro ligado!");
    }

    @Override
    public void acelerar(){
        System.out.println("Carro acelerando!");
    }
}
