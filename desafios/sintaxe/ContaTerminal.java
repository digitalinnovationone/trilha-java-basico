
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Insira o numero da conta: ");
        int numero = input.nextInt();
        input.nextLine();

        System.out.print("Insira a agencia: ");
        String agencia = input.nextLine();

        System.out.print("Insira o seu nome: ");
        String nomeCliente = input.nextLine();

        System.out.print("Insira seu saldo: ");
        double saldo = input.nextDouble();
        System.out.println();

        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco," +
                " sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque;",
                nomeCliente,
                agencia,
                numero,
                saldo));

        input.close();

    }
}
