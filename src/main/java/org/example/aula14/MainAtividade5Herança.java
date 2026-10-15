package org.example.aula14;

public class MainAtividade5Herança {
    public static void main(String[] args) {

        Diretora carla = new Diretora();

        carla.nome = "Carla";

        carla.baterPonto();
        carla.aprovarFerias("João");
        carla.definirMeta("Aumentar vendas em 20%");
    }
}
