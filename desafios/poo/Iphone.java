package desafios.poo;

public class IPhone {
    // Interface para o Reprodutor Musical
    public interface ReprodutorMusical {
        void tocar();

        void pausar();

        void selecionarMusica(String musica);
    }

    // Interface para o Aparelho Telefônico
    public interface AparelhoTelefonico {
        void ligar(String numero);

        void atender();

        void iniciarCorreioDeVoz();
    }

    // Interface para o Navegador na Internet
    public interface NavegadorInternet {
        void exibirPagina(String url);

        void adicionarNovaAba(String url);

        void atualizarPagina();
    }

    // Classe que representa o iPhone
    public static class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
        private boolean isPlayingMusic = false;
        private String currentSong = "";
        private boolean isCallInProgress = false;
        private boolean isVoiceMailActive = false;
        private String currentURL = "";

        // Implementação dos métodos da interface ReprodutorMusical
        @Override
        public void tocar() {
            if (!isPlayingMusic) {
                isPlayingMusic = true;
                System.out.println("Tocando música.");
            }
        }

        @Override
        public void pausar() {
            if (isPlayingMusic) {
                isPlayingMusic = false;
                System.out.println("Música pausada.");
            }
        }

        @Override
        public void selecionarMusica(String musica) {
            if (isPlayingMusic) {
                currentSong = musica;
                System.out.println("Selecionada a música: " + musica);
            }
        }

        // Implementação dos métodos da interface AparelhoTelefonico
        @Override
        public void ligar(String numero) {
            if (!isCallInProgress) {
                isCallInProgress = true;
                System.out.println("Ligando para " + numero);
            }
        }

        @Override
        public void atender() {
            if (isCallInProgress) {
                isCallInProgress = false;
                System.out.println("Chamada atendida.");
            }
        }

        @Override
        public void iniciarCorreioDeVoz() {
            if (isCallInProgress) {
                isCallInProgress = false;
                isVoiceMailActive = true;
                System.out.println("Iniciado correio de voz.");
            }
        }

        // Implementação dos métodos da interface NavegadorInternet
        @Override
        public void exibirPagina(String url) {
            currentURL = url;
            System.out.println("Exibindo página: " + url);
        }

        @Override
        public void adicionarNovaAba(String url) {
            System.out.println("Nova aba adicionada com a página: " + url);
        }

        @Override
        public void atualizarPagina() {
            System.out.println("Página atualizada: " + currentURL);
        }

        public static void main(String[] args) {
            IPhone iphone = new IPhone();

            iphone.tocar();
            iphone.selecionarMusica("Música 1");
            iphone.pausar();

            iphone.ligar("123-456-789");
            iphone.atender();
            iphone.iniciarCorreioDeVoz();

            iphone.exibirPagina("www.example.com");
            iphone.adicionarNovaAba("www.openai.com");
            iphone.atualizarPagina();
        }
    }
}
