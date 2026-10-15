package org.example.aula14;
/*4. (herança — quem não sobrescreve)
   Crie a classe Estagiaria, filha de Pessoa, que NÃO sobrescreve
   o apresentar() e não acrescenta nada.
   Na Main, crie o objeto, dê valor aos atributos, guarde ele numa
   variável do tipo da mãe e chame o método apresentar().
   O que saiu? Por quê? */
public class MainAtividade4Polimorfismo {
    public static void main(String[] args) {

        Pessoa estagiaria = new Estagiaria();

        estagiaria.nome = "Bia";
        estagiaria.idade = 22;

        estagiaria.apresentar();

        //Saiu a mensagem exata definida na Classe Pessoa.
        //E o motivo é porque ela herdou tudo da mãe.
    }
}
