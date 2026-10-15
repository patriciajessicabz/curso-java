package org.example.aula14;

public class Boleto implements MeioDePagamento {

    @Override
    public void pagar(double valor){
        System.out.printf("Boleto no valor de R$ %.2f gerado com sucesso. Vencimento em 3 dias.%n ", valor);
    }
}
