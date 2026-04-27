package main;

import controller.Browser;
import controller.Phone;
import controller.MusicPlayer;

public class Iphone {

    static void main() {

        Phone caller = new Phone();
        MusicPlayer spotify = new MusicPlayer();
        Browser fireFox = new Browser();

        caller.iniciarCorreioVoz();
        caller.ligar("21 99900-1234");
        caller.atender();

        spotify.tocar();
        spotify.selecionarMusica("Guerra & Pace, Pollo e Brace");

        fireFox.exibirPagina("youtube.com");
        fireFox.atualizarPagina();
        fireFox.adicionarNovaAba();
    }

}
