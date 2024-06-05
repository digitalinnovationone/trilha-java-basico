import Aparelho.iPhone;

public class Main {
    public static void main(String[] args) {



        iPhone iphone = new iPhone();


        System.out.println("-----Reprodutor Musical-----");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("The Neighbourhood - Reflections");

        System.out.println("-----Aparelho Telefônico-----");
        iphone.ligar("89945965-47");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("-----Navegador na Internet-----");
        iphone.exibirPagina("https://www.apple.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}