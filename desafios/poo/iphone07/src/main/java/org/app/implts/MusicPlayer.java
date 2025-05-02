package org.app.implts;

import org.app.interfaces.IMusicPlayer;

public final class MusicPlayer implements IMusicPlayer {
    @Override
    public void play() {
        print("playing music");
    }

    @Override
    public void pause() {
        print("paused music");
    }

    @Override
    public void selectMusic(String music) {
        print("Playing "+ music);
    }
    private void print(String text){
      System.out.println(text);
    };
}
