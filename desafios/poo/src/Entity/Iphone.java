package Entity;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void ligar(String contato) {
        System.out.println("Ligando para " + contato);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Reproduzindo correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Mostrando página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada!");
    }

    @Override
    public void tocar(String music) {
        System.out.println("Tocando " + music);
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Musica selecionada!");
    }
}
