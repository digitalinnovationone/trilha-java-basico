##### prévia do código - 


````java
public class iPhone implements iMusic, iCall, iWeb {

}

````

````java
public interface iMusic {

	private String Musica [] musicas;

	private String artista;

	private String album;

	public void tocar();

	public void pausar();

	public String selecionarMusica(String musica);

	public abstract String selecionarArtista(String artistaa);

	public abstract String selecionarAlbum(String album);

}


````

````java
public interface iCall {

	private String Contato[] contatos;

	/**
	 *  
	 */
	public void ligar();

	public void atender();

	public abstract void iniciarCorreioVoz();

}


````


````java
public interface iWeb {

	public abstract void exibirPagina();

	public abstract void adicionarNovaAba();

	public abstract void atualizarPagina();

}

````

