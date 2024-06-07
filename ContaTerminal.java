import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("digite sua agencia: ");
        int agencia = scanner.nextInt();
        System.out.println("digite seu numero: ");
        int num = scanner.nextInt();
        System.out.println("digite seu saldo: ");
        float saldo = scanner.nextFloat();

        String mensagemFinal = "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + num + ", e seu saldo " + saldo + " ja esta disponivel para saque. ";
        System.out.println(mensagemFinal);

    }
}
