package org.example.aula4estruturasdedecisão;

public class ExerciciosEstruturasdeDecisão2 {
    static void main() {
        /*2 — Crie variáveis para o saldo da conta (R$ 500.00) e o valor de uma compra (R$ 320.00). Se o saldo
        for suficiente, mostre "Compra aprovada!" e o saldo restante. Se não for, mostre "Saldo insuficiente"
        e quanto está faltando.
         */

        double saldo = 500.00;
        double compra = 320.00;

        if (saldo >= compra) {
            double restante = saldo - compra;
            System.out.println("Compra aprovada!");
            System.out.println("Saldo restante: R$ " + restante);}
            else {
            double faltando = compra - saldo;
            System.out.println("Saldo insuficiente");
            System.out.println("Está faltando: R$ " + faltando);
        }
    }
}
