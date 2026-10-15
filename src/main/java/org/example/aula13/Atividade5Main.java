package org.example.aula13;
//5. Crie uma interface Veiculo com DOIS métodos: ligar() e acelerar().
//   Crie Carro e Moto implementando os dois. Coloque numa lista e
//   percorra com for-each chamando os dois métodos em cada um.

import java.util.ArrayList;

public class Atividade5Main {
    public static void main(String[] args) {

        ArrayList<VeiculoExercicio5> veiculos = new ArrayList<>();

        veiculos.add( new CarroExercicio5());
        veiculos.add(new MotoExercicio5());

        for (VeiculoExercicio5 veiculo : veiculos){
            veiculo.ligar();
            veiculo.acelerar();
        }
    }
}
