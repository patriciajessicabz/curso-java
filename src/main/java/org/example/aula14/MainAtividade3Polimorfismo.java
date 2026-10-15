package org.example.aula14;
/*3. Crie a classe Professora, também filha de Pessoa, com o atributo
   disciplina e o método lancarNota(String aluna, double nota), que
   imprime algo como "Flora lançou nota 9.5 para Ana". Use printf
   com %.1f.
   Na Main, crie uma aluna e uma professora e dê valor aos atributos
   de cada objeto:
   Professora flora = new Professora();
   flora.nome = "Flora";
   flora.idade = 30;
   flora.disciplina = "Java e IA";
   Faça o mesmo com a aluna e chame os métodos das duas.*/
public class MainAtividade3Polimorfismo {
    public static void main(String[] args) {

        Professora2 Flora = new Professora2();
        Flora.nome = "Flora";
        Flora.idade = 30;
        Flora.disciplina = "Java e Ia";

        Aluna ana = new Aluna();
        ana.nome = "Ana";
        ana.idade = 20;
        ana.curso = "Java";

        Flora.apresentar();
        ana.apresentar();

        Flora.lancarNota(ana.nome, 9.5);
    }
}
