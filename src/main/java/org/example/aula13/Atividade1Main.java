package org.example.aula13;
//3. Crie um ArrayList<Animal>, coloque um cachorro e um gato dentro,
//   e percorra com for-each chamando emitirSom(). Repare que não
//   tem nenhum if. Dica:
//animais.add(new Cachorro());
import java.util.ArrayList;

public class Atividade1Main {
    public static void main(String[] args) {

         /*2. Agora acrescente a classe Gato, que implementa a mesma interface e
          imprime "Miau!". Na main, declare as duas variáveis como Animal:
          Animal bidu = new Cachorro();
          Animal salem= new Gato();
          Chame emitirSom() nas duas. */

         // Animal bidu = new CachorroExercicio1();
         // Animal salem= new GatoExercicio1();

         // bidu.emitirSom();
         // salem.emitirSom();

         /*3. Crie um ArrayList<Animal>, coloque um cachorro e um gato dentro,
         e percorra com for-each chamando emitirSom(). Repare que não
         tem nenhum if. Dica:
         animais.add(new Cachorro()); */

        ArrayList<Exercicio1Animal> animais = new ArrayList<>();

        animais.add(new CachorroExercicio1());
        animais.add(new GatoExercicio1());

        for (Exercicio1Animal animal : animais) {
            animal.emitirSom();
        }

    }
}
