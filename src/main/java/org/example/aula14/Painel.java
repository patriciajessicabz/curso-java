package org.example.aula14;

public class Painel {

    public void exibir(String texto){
        System.out.println("Exibindo Texto (String): " + texto);
    }
    public void exibir(int numero) {
        System.out.println("Exibindo Numero Inteiro (int): " + numero);
    }
    public void exibir(boolean condicao) {
        System.out.println("Exibindo Boolean (boolean): " + condicao);
    }
    public void exibir(double valor) {
        System.out.println("Exibindo Decimal (double): " + valor);
    }
}
