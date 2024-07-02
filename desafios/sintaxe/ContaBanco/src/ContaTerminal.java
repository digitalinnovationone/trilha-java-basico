import java.util.Scanner;
public class ContaTerminal {
    int conta;
    int agencia;
    String nome;
    double saldo;

    Scanner scan = new Scanner(System.in);

    void  input(){
        System.out.println("Digite seu nome: ");
        nome = scan.next();
        System.out.println("Digite a conta: ");
        conta = scan.nextInt();
        System.out.println("Digite sua agencia: ");
        agencia = scan.nextInt();
        System.out.println("Digite seu saldo: ");
        saldo = scan.nextDouble();
        output();
    }


    void output(){
        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d e seu saldo %.2f já está disponível para saque.",
        nome, agencia, conta, saldo);
         // Exibindo a mensagem
         System.out.println(mensagem);
    }
}
