package org.example.aula13;

public class EmailExercicio4 implements Exercicio4Notificacao {

    @Override
    public void enviar(String mensagem){
        System.out.println("E-mail enviado: " + mensagem);
    }


}
