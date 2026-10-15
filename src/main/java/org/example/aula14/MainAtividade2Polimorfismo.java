package org.example.aula14;
/*2. (mesma classe — muda o TIPO do parâmetro)
   Crie a classe Painel com QUATRO métodos chamados exibir, cada um
   recebendo um tipo diferente: String, int, boolean e double.
   Cada um imprime de um jeito, dizendo que tipo recebeu.
   Chame os quatro.
   Depois pense: por que o System.out.println() aceita texto, número,
   boolean e objeto, ao invés de ter um método println para cada?
   É exatamente isso que vocês acabaram de fazer.*/

public class MainAtividade2Polimorfismo {
    public static void main(String[] args) {

        Painel painel = new Painel();

        painel.exibir("Olá Java! ");
        painel.exibir(23);
        painel.exibir(false);
        painel.exibir(55.3);

    }
}
