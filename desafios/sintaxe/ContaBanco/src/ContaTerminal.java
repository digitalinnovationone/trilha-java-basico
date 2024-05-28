import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		int numero;
		String agencia, nomeCliente;
		double saldo;

		System.out.print("Digite o número da conta: ");
		numero = sc.nextInt();

		System.out.print("Digite o número de sua agência: ");
		agencia = sc.next();

		System.out.print("Digite seu nome: ");
		nomeCliente = sc.next();

		System.out.print("Digite seu saldo: ");
		saldo = sc.nextDouble();

		System.out.println("Olá " + nomeCliente + 
				", obrigado por criar uma conta em nosso banco, sua agência é "
				+ agencia + 
				", conta " 
				+ numero + 
				" e seu saldo R$" 
				+ saldo + 
				" já está disponível para saque.");
		sc.close();
	}

}
