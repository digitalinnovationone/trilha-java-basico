// Interface ReprodutorMusical.java
public interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica();
}

// Interface AparelhoTelefonico.java
public interface AparelhoTelefonico {
    void ligar();
    void atender();
    void iniciarCorreioVoz();
}

// Interface NavegadorInternet.java
public interface NavegadorInternet {
    void exibirPagina();
    void adicionarNovaAba();
    void atualizarPagina();
}

// Classe IPhone.java
public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocar() {
        // Implementação para tocar música.
    }

    @Override
    public void pausar() {
        // Implementação para pausar música.
    }

    @Override
    public void selecionarMusica() {
        // Implementação para selecionar música.
    }

    @Override
    public void ligar() {
        // Implementação para ligar o telefone.
    }

    @Override
    public void atender() {
        // Implementação para atender chamadas.
    }

    @Override
    public void iniciarCorreioVoz() {
        // Implementação para iniciar correio de voz.
    }

    @Override
    public void exibirPagina() {
        // Implementação para exibir páginas da internet.
    }

    @Override
    public void adicionarNovaAba() {
        // Implementação para adicionar nova aba no navegador.
    }

    @Override
    public void atualizarPagina() {
        // Implementação para atualizar a página no navegador.
    }

    // Outros métodos e propriedades específicos do iPhone podem ser adicionados aqui.
}
