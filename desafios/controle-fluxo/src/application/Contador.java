package application;

import exception.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro:");
        int parUm = terminal.nextInt();
        System.out.println("Digite o primeiro parametro:");
        int parDois = terminal.nextInt();

        try {
            contar(parUm, parDois);
        } catch (ParametrosInvalidosException e){
            e.printStackTrace();
        }
    }

    public static void contar(int parUm, int parDois) throws ParametrosInvalidosException {
        if (parUm > parDois) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = parDois - parUm;
            for (int i = 0; i <= contagem; i++){
                System.out.println(i);
            }
        }
    }

}