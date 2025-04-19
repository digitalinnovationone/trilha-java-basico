package com.contador;

import java.util.Scanner;

import com.contador.Exceptions.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) {
        System.out.println("Starting program.... ");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try (Scanner snScanner = new Scanner(System.in)) {

            System.out.printf("\nDigite o primeiro parâmetro: ");
            int value1 = snScanner.nextInt();
            System.out.printf("\nDigite o segundo parâmetro: ");
            int value2 = snScanner.nextInt();

            count(value1, value2);

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    static void count(int value1,int value2) throws ParametrosInvalidosException, InterruptedException{
        if(value1>value2){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior");
        }
        int diff= value2-value1;

        for(int i=1;i<=diff;i++){
            System.out.println("Imprimindo o numero "+i);
            Thread.sleep(1000);
        }

    }
}
