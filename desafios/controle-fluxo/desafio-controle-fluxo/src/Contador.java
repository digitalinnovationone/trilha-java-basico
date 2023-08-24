import java.util.Scanner;

/**
 * Counts from a number to another number given by the user in the terminal.
 * 
 * @author GleidsonLM
 * @version 0.1
 * @since 2023-08-24
 */
public class Contador {
	/**
	 * Receives user input and calls the method that contains the logic to count.
	 * 
	 * @param args
	 * @see #contar(int, int)
	 */
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();

		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

		try {
			// chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException exception) {
			// imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println(exception);
		}

		terminal.close();

	}

	/**
	 * Receives two numbers, and prints the numbers between then in the terminal.
	 * 
	 * @param parametroUm
	 * @param parametroDois
	 * @throws ParametrosInvalidosException
	 * 
	 */
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		// validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}

		int contagem = parametroDois - parametroUm;
		// realizar o for para imprimir os números com base na variável contagem
		for (int i = 0; i <= contagem; i++) {
			System.out.println("Imprimindo o número " + (parametroUm + i));
		}
	}
}
