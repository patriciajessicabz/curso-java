package org.example.aula13;

public class SMSExercicio4 implements Exercicio4Notificacao {

    @Override
    public void enviar(String mensagem){
        System.out.println("SMS enviado: " + mensagem);
    }

}
