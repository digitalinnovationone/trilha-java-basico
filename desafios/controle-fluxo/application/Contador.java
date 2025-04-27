package application;

import exception.ParametrosInvalidosException;
import java.util.Scanner;

public class Contador {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
			try {
				
				System.out.print("Insira o primeiro parâmetro: ");
				int p1 = Integer.parseInt(input.nextLine());
				System.out.print("Insira o segundo parâmetro: ");
				int p2 = Integer.parseInt(input.nextLine());
				
				
				contar(p1, p2);
				
				break;
				
				}catch (ParametrosInvalidosException e) {
					System.out.println(e.getMessage());
					System.out.println();
					continue;
				} catch(Exception e) {
					System.out.println(e.getMessage());
				}
		}
		
		
	}
	static void contar(int p1, int p2 ) throws ParametrosInvalidosException {
		if(p1 > p2) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}
		
		int count = p2 - p1;
		//realizar o for para imprimir os números com base na variável contagem
		for(int i = 0; i < count; i++) {
			System.out.println(String.format("Imprimindo o número %d", i+1));
		}
		return;
	}

}
