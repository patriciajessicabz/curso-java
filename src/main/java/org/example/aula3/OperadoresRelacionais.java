package org.example.aula3;

public class OperadoresRelacionais {
    static void main() {

        /* 1- Crie variáveis para as notas de duas alunas. Mostre na tela o resultado de:
        são iguais, são diferentes, a primeira é maior, a primeira é menor para quando:
        - a = 10, b = 3
        - a = 3, b = 10
        - a = 5, b = 5
         */
        int a = 10;
        int b = 3;

        System.out.println("A = " + a + ", B = " + b);
        System.out.println("São iguais? " + (a == b));
        System.out.println("São diferentes? " + (a != b));
        System.out.println("A primeira é maior? " + (a > b));
        System.out.println("A primeira é menor? " + (a < b));

        System.out.println();

        // Caso 2
        a = 3;
        b = 10;

        System.out.println("A = " + a + ", B = " + b);
        System.out.println("São iguais? " + (a == b));
        System.out.println("São diferentes? " + (a != b));
        System.out.println("A primeira é maior? " + (a > b));
        System.out.println("A primeira é menor? " + (a < b));

        System.out.println();

        // Caso 3
        a = 5;
        b = 5;

        System.out.println("A = " + a + ", B = " + b);
        System.out.println("São iguais? " + (a == b));
        System.out.println("São diferentes? " + (a != b));
        System.out.println("A primeira é maior? " + (a > b));
        System.out.println("A primeira é menor? " + (a < b));
    }
}
