package org.example.aula14;

public class Professora2 extends Pessoa {
    public String disciplina;

    public void lancarNota(String aluna, double nota){
        System.out.printf("%s lançou nota %.1f para %s.%n", nome, nota, aluna);
    }

}
