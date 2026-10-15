package org.example.aula14;
/*5. (herança — método que recebe a mãe)
   Crie um método na sua classe Main:
   static void mostrarFicha(Pessoa p) {
   p.apresentar();}
   Chame ele três vezes, passando a aluna, a professora e a estagiária.
   O método não sabe quem vai receber, e funciona pros três.*/
public class MainAtividade5Polimorfismo {

    static void mostrarFicha(Pessoa p){
        p.apresentar();
    }

    public static void main(String[] args) {

        Aluna aluna = new Aluna();
        aluna.nome = "Ana";
        aluna.idade = 20;

        Professora2 professora2 = new Professora2();
        professora2.nome = "Flora";
        professora2.idade = 30;


        Estagiaria estagiaria = new Estagiaria();
        estagiaria.nome = "Bia";
        estagiaria.idade = 22;

        mostrarFicha(aluna);
        mostrarFicha(professora2);
        mostrarFicha(estagiaria);
    }

}
