import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numero = 0;
        String agencia = new String("");
        String nomeCliente = new String("");
        double saldo = 0.0;

        System.out.println("Informe seu nome:");
        nomeCliente = scan.nextLine();
        System.out.println("Informe sua agência:");
        agencia = scan.nextLine();
        System.out.println("Informe o numero da conta:");
        numero = scan.nextInt();
        System.out.println("Informe o saldo da conta:");
        saldo = scan.nextDouble();


        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agencia é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
    }
}