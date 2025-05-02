package org.app.implts;

import org.app.interfaces.ITelephone;

public class Telephone implements ITelephone {
    @Override
    public void call(String number) {
        System.out.println("by calling the number  " + number);
    }

    @Override
    public void answerCall() {
        System.out.println("answer call");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("starting voicemail");
    }
}
