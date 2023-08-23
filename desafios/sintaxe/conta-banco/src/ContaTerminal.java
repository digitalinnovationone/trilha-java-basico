
public class ContaTerminal {
    /**
     * Main method to run the program and call its internal methods
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        int clienteContaNumero = getUserInput();

        if (clienteContaNumero != 0) {
            setUserOutput(clienteContaNumero);
        }
    }

    /**
     * Receives user input and handles exceptions if not a number
     * 
     * @return String
     */
    private static int getUserInput() {
        String inputContaAgencia = System.console().readLine("Digite o número da conta: ");

        try {
            return Integer.parseInt(inputContaAgencia);
        } catch (Exception error) {
            System.out.println("Erro ao ler o número da conta: " + error);
            return 0;
        }
    }

    /**
     * Sets user output based on the account number
     * 
     * @param clienteContaNumero int Customer account number
     * @return void Invokes {@link printUserOutput}
     */
    private static void setUserOutput(int clienteContaNumero) {
        int contaNumero = 1021;
        String contaAgencia = "067-8";
        String clienteNome = "MARIO ANDRADE";
        double clienteSaldo = 237.48;

        if (clienteContaNumero == contaNumero) {
            printUserOutput(
                    "Olá "
                            .concat(clienteNome)
                            .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                            .concat(contaAgencia)
                            .concat(", conta ")
                            .concat(String.valueOf(contaNumero))
                            .concat(" e seu saldo ")
                            .concat(String.valueOf(clienteSaldo))
                            .concat(" já está disponível para saque"));

        } else {
            printUserOutput("Conta não encontrada");
        }
    }

    /**
     * Prints user output
     * 
     * @param output String User output message
     * @return void
     */
    private static void printUserOutput(String output) {
        System.out.println(output);
    }
}
