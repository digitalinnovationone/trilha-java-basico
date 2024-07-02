import java.util.Scanner;

public class ContaTerminal {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {

        int contaNumero;
        String agencia;
        String nomeCliente;
        float saldo;

        Scanner sc = new Scanner(System.in); 

        System.out.println("Digite o número da Conta"); 
        contaNumero = sc.nextInt();
        System.out.println("Digite o código da agência"); 
        agencia = sc.next();
        System.out.println("Digite o nome do Cliente"); 
        nomeCliente = sc.next();
        System.out.println("Digite o saldo"); 
        saldo = sc.nextFloat();


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + contaNumero + " e seu saldo " + saldo + " já está disponível para saque" );
       }



}
