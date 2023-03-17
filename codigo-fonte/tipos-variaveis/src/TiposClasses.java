public class TiposClasses {
    public static void main(String[] args) {
        String meuNome = "lari";
        int nasc = 2022;
        boolean verdadeira = true;
        nasc = 1998;
        String primeiroNome = "larissa";
        String segundoNome = "leonel";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);


    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }


}


