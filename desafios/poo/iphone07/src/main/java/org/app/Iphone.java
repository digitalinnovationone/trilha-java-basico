package org.app;

import org.app.implts.Browser;
import org.app.implts.MusicPlayer;
import org.app.implts.Telephone;
import org.app.interfaces.IBrowser;
import org.app.interfaces.IMusicPlayer;
import org.app.interfaces.ITelephone;

public final class Iphone {

    private final IBrowser browser;
    private final ITelephone telephone;
    private  final IMusicPlayer musicPlayer;


    public Iphone(){
        browser= new Browser();
        telephone= new Telephone();
        musicPlayer= new MusicPlayer();
    }


    public void openBrowserTab(){
      browser.newTab();
    };

    public void startCall(String number){
      telephone.call(number);
    };

    public void openMusicPlayer(){
        musicPlayer.play();
    }
}
