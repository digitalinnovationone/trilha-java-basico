package org.app;


public class App 
{
    public static void main( String[] args )
    {
        Iphone iphone= new Iphone();

        iphone.openBrowserTab();
        iphone.openMusicPlayer();
        iphone.startCall("55944943234");
    }
}
