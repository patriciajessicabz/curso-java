package org.example.aula14;

public class Calculadora {

    //Quadrado
    public double calcularArea(double lado) {
        return lado * lado;
    }
    //Retângulo
    public double calcularArea(double base, double altura) {
        return base * altura;
    }
    //Circulo
    public double calcularArea(int raio) {
        return 3.14159 * raio * raio;
    }
}
