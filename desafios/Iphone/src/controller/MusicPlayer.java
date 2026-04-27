package controller;

public class MusicPlayer {

    private boolean play = false;

    public MusicPlayer(){super();}

    public MusicPlayer(boolean play){
        super();
        this.play = play;
    }

    public boolean tocar(){return play = true;}

    public boolean pausa(){return play;}

    public void selecionarMusica(String music){
        if (play) {
            System.out.printf("playing %s %n", music);
        } else {
            System.out.printf("Music %s selected %n", music);
        }
    }

}
