package application;

import java.util.Scanner;

import utils.ParametrosInvalidosException;

public class Contador {
 	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		} catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println(exception.getMessage());
		}
		
		terminal.close();
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		int contagem = parametroDois - parametroUm;
		
		//realizar o for para imprimir os números com base na variável contagem
		
		if (contagem > 0) {
			for (int i = 0; i < contagem; i ++) {
				System.out.println("Imprimindo o número " + (i + 1));
			}
		} else {
			throw new ParametrosInvalidosException();
		}
	}
}