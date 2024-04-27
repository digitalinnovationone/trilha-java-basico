package com.example;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Agência !");
        int numero = in.nextInt();

        System.out.println("Por favor, digite o nome da Agência !");
        String agencia = in.next();

        System.out.println("Por favor, digite seu nome !");
        String nome = in.next();

        System.out.println("Por favor, digite o seu saldo !");
        double saldo = in.nextDouble();
        
        in.close();
        
        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nome, agencia, numero, saldo));
    
    }
}