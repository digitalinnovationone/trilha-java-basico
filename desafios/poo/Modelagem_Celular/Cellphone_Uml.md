````mermaid
classDiagram
    interface IBrowser {
        +openPage(url: String)
        +addNewPage()
        +reloadPage()
    }

    interface IMusicPlayer {
        +play()
        +pause()
        +selectMusic(music: String)
    }

    interface ITelephone {
        +call(numero: String)
        +answerCall()
        +startVoicemail()
    }

    class Browser
    class MusicPlayer
    class Telephone

    class Cellphone {
        +openPage(url: String)
        +addNewPage()
        +reloadPage()
        +play()
        +pause()
        +selectMusic(music: String)
        +call(numero: String)
        +answerCall()
        +startVoicemail()
    }

    %% Relações de implementação
    IBrowser <|.. Browser
    IMusicPlayer <|.. MusicPlayer
    ITelephone <|.. Telephone

    Browser <|.. Cellphone
    MusicPlayer <|.. Cellphone
    Telephone <|.. Cellphone

    %% Notas para simular interfaces
    note for IMusicPlayer "Interface"
    note for ITelephone "Interface"
    note for IBrowser "Interface"

````
