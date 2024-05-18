import java.util.Locale;
import java.util.Scanner;

//Waldemir Junior

public class ContaTerminal {
        public static void main(String[] args) {

            Scanner leia = new Scanner(System.in).useLocale(Locale.US);
    
            System.out.println("Por favor, digite o número da Conta");
            int numero = leia.nextInt();
    
            System.out.println("Por favor, digite o número da Agencia !");
            String agencia = leia.next();
    
            System.out.println("Por favor, digite o  nome do cliente!");
            String nome = leia.next();
    
            System.out.println("Por favor, digite o saldo da conta !");
            double saldo = leia.nextDouble();
    
            System.out.println("Olá " + nome + " , obrigado por criar uma conta em nosso banco, sua agência é: " + agencia
                    + ", conta: " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");

            leia.close();

         
        }
        
        
    }     
    

