package org.example.petshop;

public class Pet {
    public String nome;
    public String especie;
    public double peso;
    public String porte;


    // Método que calcula e devolve o porte baseado no peso do pet
    public String definirPorte() {
        if (this.peso < 10) {
            return "Pequeno";
        } else if (this.peso < 25) {
            return "Médio";
        } else {
            return "Grande";
        }
    }
}

