package org.example.aula14;

public class MainAtividade2Heranca {
    public static void main(String[] args) {

        Aluna aluna = new Aluna();

        aluna.nome = "Ana";
        aluna.idade = 18;
        aluna.curso = "Java";

        aluna.apresentar();
        aluna.estudar();
    }
}
