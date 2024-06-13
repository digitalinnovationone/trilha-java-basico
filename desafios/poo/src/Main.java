import aparelho.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("Reprodutor Musical");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Music");

        System.out.println("Aparelho Telefônico");
        iphone.ligar("1197503322");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("Navegador na Internet");
        iphone.exibirPagina("https://www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}