package org.example.petshop;

public class Petshop {
    private Pet[] lista = new Pet[5];
    private int total = 0;

    public boolean cadastrarPet(Pet pet){
        if(total < lista.length){
        lista[total] = pet;
        total++;
        return true;
        } else{
            return false;
        }
    }

    public int getTotal(){
        return total;
    }

    public Pet getPet(int indice){
        if(indice >= 0 && indice < total){
            return lista[indice];
        }
        return null;
    }
}
