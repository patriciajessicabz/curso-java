package org.example.aula08;
/*6 — Crie três métodos com o mesmo nome somar:
um que recebe dois inteiros
um que recebe três inteiros
um que recebe dois decimais
No main, chame os três e veja o Java escolher sozinho qual usar. */
public class Atividade6Metodos {
   public static void main(String[] args) {

       int somar2int = Utilidades.somar(6, 20);
       System.out.println("Soma de 2 inteiros: " + somar2int);

       int soma3Int = Utilidades.somar(4, 15, 35);
       System.out.println("Soma de 3 inteiros: " + soma3Int);

       double soma2Double = Utilidades.somar(8.5, 3.2);
       System.out.println("Soma de 2 decimais: " + soma2Double);

    }
}
