package org.example.petshop;

public class Petshop {

    String nome;
    String especie;
    double peso;
    String porte;

    String definirPorte() {
        if (peso < 10) {
            return "Pequeno";
        } else if (peso < 25) {
            return "Médio";
        } else {
            return "Grande";
        }
    }
}
