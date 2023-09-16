import java.util.Collection;

/** 
 * @author GleidsonLM
 * @version 0.1
 */

/**
 * Main class ClassesDoIphone
 */
public class ClassesDoIphone {
    public static void main(String[] args) throws Exception {

    }

    /**
     * Class Music is an object with required title and music metadata
     * 
     * @param title required String
     */
    private class Music {
        protected String title;

        /**
         * Constructor for Music
         * 
         * @param title required String
         */
        private Music(String title, String artist, String album) {
            this.title = title;
        }
    }

    /**
     * Interface MediaPlayer contains the methods to play, pause, and select music.
     * 
     * @param music required Music
     */
    public interface MediaPlayer {
        public void play(Music music);

        public void pause();

        public void selectMusic(Music music);
    }

    /**
     * Class iTunes implements MediaPlayer
     * 
     * @param currentMusic required Music
     * @param isPlaying    required boolean
     * @see MediaPlayer
     * @see Music
     */
    public class iTunes implements MediaPlayer {
        private Music currentMusic = null;
        private boolean isPlaying = false;

        /**
         * Method to play music
         * 
         * @param music required Music
         */
        @Override
        public void play(Music music) {
            if (this.isPlaying) {
                this.pause();
            }
            this.currentMusic = music;
            this.isPlaying = true;
            System.out.println("Playing " + this.currentMusic.title + "...");
        }

        /**
         * Method to pause music
         */
        @Override
        public void pause() {
            this.isPlaying = false;
            System.out.println("Paused");
        }

        /**
         * Method to select music
         * 
         * @param music required Music
         * @see Music
         */
        @Override
        public void selectMusic(Music music) {
            this.currentMusic = music;
            this.play(music);
        }
    }

    /**
     * Class Contact is an object with required name and phone number
     * 
     */
    private class Contact {
        protected String phoneNumber;

        /**
         * Constructor for Contact
         * 
         * @param phoneNumber required String
         */
        private Contact(String name, String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    }

    /**
     * Interface PhoneCall contains the methods to make and receive calls
     * 
     * @param contact required Contact
     */
    public interface PhoneCall {
        public void call();

        public void answer();

        public void voiceMail();
    }

    /**
     * Class PhoneApp is an app that makes and receives calls and implements
     * PhoneCall
     */
    public class Phone implements PhoneCall {
        private boolean isCalling = false;
        private Contact caller = null;

        @Override
        public void call() {
            if (this.isCalling) {
                this.voiceMail();
            }
            this.isCalling = true;
            System.out.println("Calling " + this.caller.phoneNumber + "...");
        }

        @Override
        public void answer() {
            if (this.isCalling) {
                this.voiceMail();
            }
            this.isCalling = true;
            System.out.println(this.caller.phoneNumber + " is calling...");
        }

        @Override
        public void voiceMail() {
            this.isCalling = false;
            System.out.println("Voice mail from " + this.caller.phoneNumber);
        }
    }

    /**
     * Class InternetPage is an object with required URI String and isLoaded boolean
     * 
     * @param uri      required String
     * @param isLoaded required boolean
     */
    private class InternetPage {
        protected String uri;
        protected boolean isLoaded;

        /**
         * Constructor for InternetPage
         * 
         * @param uri      required String
         * @param isLoaded required boolean
         */
        private InternetPage(String uri, boolean isLoaded) {
            this.uri = uri;
            this.isLoaded = isLoaded;
        }

        /**
         * Method to get isLoaded method
         */
        public boolean getIsLoaded() {
            return this.isLoaded;
        }

        /**
         * Method to set isLoaded method
         * 
         * @param isLoaded required boolean
         */
        public void setIsLoaded(boolean isLoaded) {
            this.isLoaded = isLoaded;
        }
    }

    /**
     * Interface InternetBrowser contains the methods to navigate the internet
     */
    public interface InternetBrowser {
        public void viewInternetPage(String uri);

        public void refreshInternetPage();
    }

    /**
     * Class Safari is an app that navigates the internet and implements
     * InternetBrowser and tabs
     */
    public class Safari implements InternetBrowser {
        private Collection<InternetPage> tabs;
        private InternetPage currentTab = null;

        /**
         * Constructor for Safari
         * 
         * @param tabs required Collection<InternetPage>
         * @return Safari
         */
        public Safari(Collection<InternetPage> tabs) {
            this.tabs = tabs;
        }

        /**
         * AddNewTab is a method to add a tab to the browser
         * 
         * @param uri String or null
         */
        public void AddNewTab(String uri) {
            if (uri == null) {
                this.tabs.add(new InternetPage("about:blank", false));
            } else {
                this.tabs.add(new InternetPage(uri, false));
            }
            System.out.println("New tab added");
        }

        /**
         * viewInternetPage is a method to view a page in the browser
         * 
         * @param uri String
         */
        @Override
        public void viewInternetPage(String uri) {
            this.currentTab = new InternetPage(uri, true);
            System.out.println("Viewing " + this.currentTab.uri + "...");
        }

        /**
         * refreshInternetPage is a method to refresh the current page
         */
        @Override
        public void refreshInternetPage() {
            if (this.currentTab == null) {
                throw new NullPointerException("No page to refresh");
            } else {
                this.currentTab.setIsLoaded(false);
                System.out.println("Refreshing " + this.currentTab.uri + "...");
            }
        }
    }
}
