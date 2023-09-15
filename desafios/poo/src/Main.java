import Entity.Iphone;
public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.ligar("Lennon");
        iphone.atender();


        iphone.selecionarMusica();
        iphone.tocar("Iron Maiden");

        iphone.exibirPagina();
    }
}
