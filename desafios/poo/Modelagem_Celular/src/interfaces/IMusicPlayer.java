package interfaces;

public interface IMusicPlayer {
    abstract void play();

    default void pause() {
        System.out.println("Music Paused!");
    }

    abstract void selectMusic(String music);
}
