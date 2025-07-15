package classes;
import interfaces.IMusicPlayer;

public class MusicPlayer implements IMusicPlayer{
    private String music;

    @Override
    public void play() {
        System.out.printf("Playing %s \n", music);
    }
    @Override
    public void selectMusic(String music) {
        this.music = music;
        System.out.printf("Selecting: %s \n", this.music);
    } 
}
