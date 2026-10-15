package org.example.aula14;

public class MainAtividade3Heranca {
    public static void main(String[] args) {

        Aluna aluna = new Aluna();

        aluna.nome = "Ana";
        aluna.idade = 18;
        aluna.curso = "Java";

        Professora professora = new Professora();

        professora.nome = "Flora";
        professora.idade = 35;
        professora.disciplina = "Programação";

        aluna.apresentar();
        aluna.estudar();

        professora.apresentar();
        professora.lancarNota("Ana", 9.5);


    }
}
