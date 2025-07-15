package interfaces;

public interface ITelephone {
    abstract void call(String number);

    default void answerCall() {
        System.out.println("Answered call");
    }

    default void startVoiceMail() {
        System.out.println("Starting voicemail");
    }
}