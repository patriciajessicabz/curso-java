package org.example.aula13;
/* 4. Crie uma interface Notificacao com o método enviar(String mensagem).
   Crie duas classes que implementam ela: Email e SMS. Cada uma
   imprime de um jeito. Adicione as duas num ArrayList<Notificacao>
   e percorra com for-each, enviando a mesma mensagem.
   Saída esperada:
   E-mail enviado: Sua compra foi aprovada!
   SMS enviado: Sua compra foi aprovada!
 */
import java.util.ArrayList;

public class Atividade4Main {
    public static void main(String[] args) {

        ArrayList<Exercicio4Notificacao> notificacoes = new ArrayList<>();

        notificacoes.add(new EmailExercicio4());
        notificacoes.add(new SMSExercicio4());

        for (Exercicio4Notificacao notificacao : notificacoes){
            notificacao.enviar("Sua compra foi aprovada! ");
        }
    }
}
