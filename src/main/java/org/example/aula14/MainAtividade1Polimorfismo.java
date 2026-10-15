package org.example.aula14;
/*1. (mesma classe — muda a QUANTIDADE de parâmetros)
   Crie a classe Calculadora com TRÊS métodos chamados calcularArea():
   - recebe um double (lado do quadrado)  -> lado * lado
   - recebe dois double (base e altura)   -> base * altura
   - recebe um int (raio do círculo)      -> 3.14159 * raio * raio
   Chame os três na Main e imprima os resultados. */
public class MainAtividade1Polimorfismo {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        System.out.println(calc.calcularArea(5.0));

        System.out.println(calc.calcularArea(4.0, 6.0));

        System.out.println(calc.calcularArea(3));

    }
}
