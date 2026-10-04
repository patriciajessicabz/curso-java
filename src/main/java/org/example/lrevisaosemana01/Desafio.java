package org.example.lrevisaosemana01;

import java.util.Scanner;

public class Desafio {
     static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         int opcao = 0; // começa com 0 para entrar no while

         while (opcao != 2) { // roda até a pessoa escolher sair

             System.out.println("Quer iniciar? \n1. Continuar \n2. Sair");

             opcao = sc.nextInt(); // lê a opção

             switch (opcao) {
                 case 1:
                     // cria uma nova aluna
                     Aluna aluna = new Aluna();

                     System.out.println("Digite sua primeira nota:");
                     aluna.nota = sc.nextDouble();

                     System.out.println("Digite sua segunda nota:");
                     aluna.nota2 = sc.nextDouble();

                     sc.nextLine(); // limpar o enter

                     aluna.media = (aluna.nota + aluna.nota2) / 2;

                     System.out.println("Qual seu nome?");
                     aluna.nome = sc.nextLine();

                     // decide se passou
                     if (aluna.media >= 6.0) {
                         aluna.passou = true;
                     } else {
                         aluna.passou = false;
                     }

                     // mostra resultado
                     System.out.printf("O nome da aluna é %s, sua primeira nota foi %.1f, sua segunda nota foi %.1f,%n"
                                     + "e sua média final foi %.1f. Aluna aprovada: %b%n",
                             aluna.nome, aluna.nota, aluna.nota2, aluna.media, aluna.passou);
                     break;

                 case 2:
                     System.out.println("Encerrando o sistema. Até logo!");
                     break;

                 default:
                     System.out.println("Opção inválida.");
                     break;
            }
        }

    }
}
