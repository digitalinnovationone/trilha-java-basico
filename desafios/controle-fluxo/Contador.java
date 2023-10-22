import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        // objeto Scanner para receber entrada do usuário
        Scanner terminal = new Scanner(System.in);

        // primeiro parâmetro
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        // segundo parâmetro
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            // Verifica se o primeiro parâmetro é maior que o segundo
            if (parametroUm > parametroDois) {
                // Lança uma exceção personalizada se a condição for verdadeira
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            // Chama a função contar se os parâmetros são válidos
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Captura e trata a exceção, exibindo a mensagem de erro
            System.out.println(exception.getMessage());
        } finally {
            // Fecha o objeto Scanner para evitar vazamentos de recursos
            terminal.close();
        }
    }

    static void contar(int parametroUm, int parametroDois) {
        // Loop para imprimir números a partir do primeiro até o segundo parâmetro
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

// Classe que define uma exceção personalizada
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}