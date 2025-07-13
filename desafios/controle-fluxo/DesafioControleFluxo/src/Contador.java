

import java.util.Scanner;

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

        }catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());

        }

        terminal.close();

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O primeiro parâmetro não pode ser maior que o segundo.");
        }

        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem ; i++){
            System.out.println("Imprimindo o número " + i);
        }
        //realizar o for para imprimir os números com base na variável contagem
    }
}