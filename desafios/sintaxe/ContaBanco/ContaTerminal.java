import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        int conta;
        String agencia, nomeCliente;
        double saldo;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nomeCliente = entrada.nextLine();
        System.out.println("Por favor, digite o numero da Agencia (com ifen)!");
        agencia = entrada.nextLine();
        System.out.println("Digite o numero da sua conta: ");
        conta = entrada.nextInt();
        System.out.println("Digite o saldo: ");
        saldo = entrada.nextDouble();
        
        entrada.close();

        System.out.println("Ola "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agencia e "+ agencia +", conta "+ conta + " e seu saldo "+ saldo +" ja esta disponivel para saque");
    }

    //TODO: Fazer validacao das entradas.
}
