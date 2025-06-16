import java.util.Scanner;

class Conta {
    int numero;
    String agencia;
    String nome;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void addSaldo(double deposito) {
        this.saldo += deposito;
    }
}

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();

        System.out.println("Por favor digite seu nome:");
        conta.nome = scanner.nextLine();

        System.out.println("Por favor digite o nome da Agência:");
        conta.agencia = scanner.nextLine();

        System.out.println("Por favor digite o número da Conta:");
        conta.numero = Integer.parseInt(scanner.nextLine());

        System.out.println("Por favor digite o seu deposito:");
        double deposito = Double.parseDouble(scanner.nextLine());
        conta.addSaldo(deposito);

        // Simplificar a impressão

        String msg = "Ola, " + conta.nome + ", obrigado por criar sua conta, sua agencia é "
            + conta.agencia + ", conta " + conta.numero + " e seu saldo R$ "  + conta.getSaldo() + " .";

        System.out.println(msg);
        scanner.close();
    }
}