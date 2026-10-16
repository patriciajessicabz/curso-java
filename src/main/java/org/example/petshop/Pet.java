package org.example.petshop;

//foi identificado classes duplicadas, como Petshop e Pet, mantive Pet, pois faz mais sentido tê-lo como características para os animais e deixar o Petshop, para gerenciamento. Posteriormente, foi ajustado o atributo porte, evitando recalculos na impressão.

// mudei o 'public String ...' para 'private' por está relacionado ao encapsulamento, qualquer outra classe poderia modificar o atributo e para que isso não acontecesse, o atributo fica acessível dentro da própria classe Pet e tem o acesso controlado com os Get e Set.

// todas as classes de atividades, exceto a 8, foram refatoradas.

public class Pet {
    private String nome;
    private String especie;
    private double peso;
    private String porte;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEspecie(){
        return especie;
    }

    public void setEspecie(String especie){
        this.especie = especie;
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public String getPorte(){
        return porte;
    }

    public void setPorte(String porte){
        this.porte = porte;
    }


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

