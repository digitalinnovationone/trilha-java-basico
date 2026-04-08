import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int parametroUm = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        // validação
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException(
                    "O segundo parâmetro deve ser maior que o primeiro"
            );
        }

        // calcula quantidade de interações
        int contagem = parametroDois - parametroUm;

        // loop
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}