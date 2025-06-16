import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);

        }catch (InputInvalidException e) {
            System.out.println(e.getMessage());
        }finally {
            terminal.close();
        }

    }

    public static void contar(int parametroUm, int parametroDois ) throws InputInvalidException {
        if(parametroUm > parametroDois) throw new InputInvalidException();

        int contagem = parametroDois - parametroUm;
        for(int i=1; i<= contagem; i++){
            System.out.println("Imprimindo o número: " + i);
        }
    }
}
