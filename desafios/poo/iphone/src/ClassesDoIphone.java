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
        System.out.println("Hello, World!");
    }

    /**
     * Class Music is an object with required title and music metadata
     * 
     * @param title required String
     */
    public class Music {
        protected String title;
        protected String artist;
        protected String album;

        /**
         * Constructor for Music
         * 
         * @param title  required String
         * @param artist required String
         * @param album  required String
         */
        public Music(String title, String artist, String album) {
            this.title = title;
            this.artist = artist;
            this.album = album;
        }
    }

    /**
     * Class MusicAlbum is a collection of music with common metadata
     * 
     * @param tracks required Collection<Music>
     * @param title  required String
     * @param artist required String
     */
    public class MusicAlbum {
        private Collection<Music> tracks;
        protected String title;
        protected String artist;

        /**
         * Constructor for MusicAlbum
         * 
         * @param tracks required Collection<Music>
         * @param title  required String
         * @param artist required String
         * @return MusicAlbum
         */
        public MusicAlbum(Collection<Music> tracks, String title, String artist) {
            this.tracks = tracks;
            this.title = title;
            this.artist = artist;
        }

        /**
         * Method to get tracks
         * 
         * @return Collection<Music>
         */
        public Collection<Music> getTracks() {
            return this.tracks;
        }

        /**
         * Method to set tracks
         * 
         * @param tracks required Collection<Music>
         */
        public void setTracks(Collection<Music> tracks) {
            this.tracks = tracks;
        }

        /**
         * Method to add track to album
         * 
         * @param track required Music
         * @return MusicAlbum
         */
        public MusicAlbum addTrack(Music track) {
            this.tracks.add(track);
            return this;
        }

        /**
         * Method to remove track from album
         * 
         * @param track required Music
         * @return MusicAlbum
         */
        public MusicAlbum removeTrack(Music track) {
            this.tracks.remove(track);
            return this;
        }

        /**
         * Method to get title
         * 
         * @return String
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * Method to set title
         * 
         * @param title required String
         */
        public void setTitle(String title) {
            this.title = title;
        }

        /**
         * Method to get artist
         * 
         * @return String
         */
        public String getArtist() {
            return this.artist;
        }

        /**
         * Method to set artist
         * 
         * @param artist required String
         */
        public void setArtist(String artist) {
            this.artist = artist;
        }
    }

    /**
     * Class MusicLibrary is a collection of music albums
     * 
     * @param albums required Collection<MusicAlbum>
     * @see MusicAlbum
     * @see Music
     */
    public class MusicLibrary {
        private Collection<MusicAlbum> albums;

        /**
         * Constructor for MusicLibrary
         * 
         * @param albums required Collection<MusicAlbum>
         * @return MusicLibrary
         */
        public MusicLibrary(Collection<MusicAlbum> albums, Collection<Music> tracks) {
            this.albums = albums;
        }

        /**
         * Method to get albums
         * 
         * @return Collection<MusicAlbum>
         */
        public Collection<MusicAlbum> getAlbums() {
            return this.albums;
        }

        /**
         * Method to add an album to the library
         * 
         * @param albums required Collection<MusicAlbum>
         */
        public void addAlbum(MusicAlbum album) {
            this.albums.add(album);
        }

        /**
         * Method to remove an album from the library
         * 
         * @param albums required Collection<MusicAlbum>
         */
        public void removeAlbum(MusicAlbum album) {
            this.albums.remove(album);
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
     * Class ITunesApp is an app that plays music and implements MediaPlayer
     */
    public class ITunesApp implements MediaPlayer {
        private boolean isPlaying = false;
        private Music playingNow = null;

        /**
         * Method to play music receives music as parameter
         * 
         * @param music required Music
         */
        @Override
        public void play(ClassesDoIphone.Music music) {
            if (this.isPlaying) {
                this.pause();
            }
            this.isPlaying = true;
            this.playingNow = music;
            System.out.println("Playing " + music.title);
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
         * Method to select music receives music as parameter
         * 
         * @param music required Music
         */
        @Override
        public void selectMusic(ClassesDoIphone.Music music) {
            if (this.isPlaying) {
                this.pause();
            }
            this.play(music);
        }
    }

    /**
     * Class Contact is an object with required name and phone number
     * 
     */
    public class Contact {
        protected String name;
        protected String phoneNumber;

        /**
         * Constructor for Contact
         * 
         * @param name        required String
         * @param phoneNumber required String
         */
        public Contact(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        /**
         * Method to get name
         * 
         * @return String
         */
        public String getName() {
            return this.name;
        }

        /**
         * Method to set name
         * 
         * @param name required String
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * Method to get phone number
         * 
         * @return String
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * Method to set phone number
         * 
         * @param phoneNumber required String
         */
        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    }

    /**
     * Class ContactList is a collection of contacts
     * 
     * @param contacts required Collection<Contact>
     * @see Contact
     */
    public class ContactList {
        private Collection<Contact> contacts;

        /**
         * Constructor for ContactList
         * 
         * @param contacts required Collection<Contact>
         * @return ContactList
         */
        public ContactList(Collection<Contact> contacts) {
            this.contacts = contacts;
        }

        /**
         * Method to get contacts
         * 
         * @return Collection<Contact>
         */
        public Collection<Contact> getContacts() {
            return this.contacts;
        }

        /**
         * Method to add a contact to the list
         * 
         * @param contact required Contact
         */
        public void addContact(Contact contact) {
            this.contacts.add(contact);
        }

        /**
         * Method to remove a contact from the list
         * 
         * @param contact required Contact
         */
        public void removeContact(Contact contact) {
            this.contacts.remove(contact);
        }

        /**
         * Method to search for a contact by name
         * 
         * @param name required String
         * @return Contact
         */
        public Contact searchContactByName(String name) {
            for (Contact contact : this.contacts) {
                if (contact.name.equals(name)) {
                    return contact;
                }
            }
            return null;
        }

        /**
         * Method to search for a contact by phone number
         * 
         * @param phoneNumber required String
         * @return Contact
         */
        public Contact searchContactByPhoneNumber(String phoneNumber) {
            for (Contact contact : this.contacts) {
                if (contact.phoneNumber.equals(phoneNumber)) {
                    return contact;
                }
            }
            return null;
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
    public class PhoneApp implements PhoneCall {
        private boolean isCalling = false;
        private Contact caller = null;

        @Override
        public void call() {
            if (this.isCalling) {
                this.voiceMail();
            }
            this.isCalling = true;
            System.out.println("Calling " + this.caller.name + "...");
        }

        @Override
        public void answer() {
            if (this.isCalling) {
                this.voiceMail();
            }
            this.isCalling = true;
            System.out.println(this.caller.name + " is calling...");
        }

        @Override
        public void voiceMail() {
            this.isCalling = false;
            System.out.println("Voice mail from " + this.caller.name);
        }
    }

}