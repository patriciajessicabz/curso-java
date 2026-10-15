package org.example.aula15;
/*1. (sentir o private na pele)
     Crie a classe ContaBancaria com os atributos titular (String) e
     saldo (double), os DOIS private.
     Na Main, crie uma conta e tente fazer estas duas linhas:
     System.out.println(c.titular);
     c.saldo = -5000;
     Rode e LEIA o erro.
     Saída esperada:
     error: titular has private access in ContaBancaria
     error: saldo has private access in ContaBancaria
     Agora a classe está fechada demais — não dá pra fazer nada
     com ela. As próximas questões abrem as portas, uma por uma.*/
public class MainAtividade1Encapsulamento {
    public static void main(String[] args) {
        /*
        ContaBancaria c = new ContaBancaria();

        System.out.println(c.titular);
        c.saldo = -5000;
         */
    }
}
