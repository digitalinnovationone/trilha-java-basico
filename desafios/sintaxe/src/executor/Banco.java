package executor;




import classe.Conta;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nomeCliente =scanner.nextLine();

        System.out.println("Digite o número da agência");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();




        Conta conta = new Conta(numero,agencia,nomeCliente,saldo);
        conta.contaCriada();





    }
}