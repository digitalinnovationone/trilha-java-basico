import classes.Browser;
import classes.MusicPlayer;
import classes.Telephone;

public class Cellphone {
    public static void main(String[] args) {
        Browser browser = new Browser();
        MusicPlayer musicPlayer = new MusicPlayer();
        Telephone telephone = new Telephone();

        browser.openPage("YouTube");
        browser.reloadPage();
        browser.addNewPage();
        System.out.println("");
        musicPlayer.selectMusic("Abracadabra");
        musicPlayer.play();
        musicPlayer.pause();
        System.out.println("");
        telephone.call("4002-8922");
        telephone.answerCall();
        telephone.startVoiceMail();
    }
}
