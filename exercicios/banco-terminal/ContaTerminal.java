import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o número da agência: ");
        String numeroAgencia = scanner.nextLine();

        System.out.print("Digite o número da conta: ");
        String numeroConta = scanner.nextLine();


        System.out.print("Digite o saldo inicial: ");
        String saldoInicial = scanner.nextLine();

        scanner.close();

        String mensagem = "Olá ".concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(numeroAgencia)
                .concat(", sua conta é ")
                .concat(numeroConta)
                .concat(", e seu saldo de ")
                .concat(saldoInicial)
                .concat(" já está disponível para saque.");

        System.out.println(mensagem);
    }
}