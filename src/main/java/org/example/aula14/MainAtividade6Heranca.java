package org.example.aula14;

public class MainAtividade6Heranca {
    public static void main(String[] args) {

        Gerente gerente = new Gerente();

        gerente.nome = "Carla";

        gerente.baterPonto();
        gerente.aprovarFerias("Ana");
        gerente.notificar("Reunião às 14h");
        gerente.exportar();


    }
}
