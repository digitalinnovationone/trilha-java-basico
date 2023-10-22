package iphone;

import java.util.Scanner;

import functionalities.Celular;

public class IPhone extends Celular{

	public static void main(String[] args) {
        IPhone iphone = new IPhone();

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();
	}

	@Override
	public void ligar() {
		System.out.println("Ligando o celular");	
	}

	@Override
	public void atender() {
		System.out.println("Atendendo a chamada telefônica");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Inciando correio de voz");
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo página web");

	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");

	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando a página web");

	}

	Scanner sc = new Scanner(System.in);
	String musica;

	@Override
	public void selecionarMusica() {
		System.out.print("Selecione uma música: ");
		musica = sc.next();
	}
	@Override
	public void tocar() {
		System.out.println("Tocando a música: " + musica);
		sc.close();
	}

	@Override
	public void pausar() {
		System.out.println("Pausando a música");
	}

}