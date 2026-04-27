package controller;

public class Phone {

    public Phone(){super();}

    public void ligar(String numero){
        System.out.printf("Ligando para %s %n", numero);
    }

    public void atender(){
        System.out.println("Atendendo ligacao");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz...");
        System.out.println("Gravando mensagem...");
    }

}
