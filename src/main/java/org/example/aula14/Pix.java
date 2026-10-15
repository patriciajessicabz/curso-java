package org.example.aula14;

public class Pix implements MeioDePagamento {

    @Override
    public void pagar(double valor){
        System.out.printf(" Pagamento de R$ %.2f realizado instantaneamente via PIX!%n ", valor);
    }
}
