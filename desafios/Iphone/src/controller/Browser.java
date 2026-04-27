package controller;

public class Browser {

    private int abas = 1;

    public void exibirPagina(String url){
        System.out.printf("Mostrando site %s %n", url);
    }

    public void adicionarNovaAba(){
        abas += 1;
        System.out.printf("Criando aba %d %n", abas);
    }

    public void atualizarPagina(){
        System.out.println("Atualizano pagina...");
        System.out.println("Pagina atualizada");
    }
}
