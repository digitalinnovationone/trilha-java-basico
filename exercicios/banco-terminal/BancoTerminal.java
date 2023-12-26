public class BancoTerminal {
    
    public static void main(String []args){
        double saldo = 25;
        
        // param2 = valor solicitado do exercicio
        saldo = calculaSaldo(saldo, 18, "exercicio 1 - ");
        
        saldo = 15; // novo saldo do exercicio
        
        saldo = calculaSaldo(saldo, 22, "exercicio 2 - ");
    }

    private static double calculaSaldo(double saldo, double valorSolicitado, String legenda){
        if (saldo >= valorSolicitado){
            saldo = saldo - valorSolicitado;
            System.out.println(legenda + "Novo Saldo: "+ saldo);
        }
        else{
            System.out.println(legenda + "Saldo insuficiente");
        }

        return saldo;
    }
}
