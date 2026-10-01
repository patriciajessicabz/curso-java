package org.example.somentetestes;

public class Testes02OperadoresAritmeticos {
    static void main() {

        double a = 17.0;
        double b = 5.0;

        System.out.println("Soma: " + ( a + b));
        System.out.println("Subtraçao: " + ( a - b ));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Resto: " + (a % b));

        // para fazer a alteração para um resultado em numeros inteiros basta mudar para int e tirar o ".0".
        // Se você quer o resultado com decimais, use double.


    }
}
