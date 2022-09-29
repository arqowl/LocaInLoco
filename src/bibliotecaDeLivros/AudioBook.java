package bibliotecaDeLivros;

public class AudioBook extends Livro{
	private int tempoDuracao;

	public AudioBook(String idLivro, String nomeLivro, int tempoDuracao) {
		super(idLivro, nomeLivro);
		this.tempoDuracao = tempoDuracao;
	}
	
	public AudioBook(String idLivro, String nomeLivro, String autorLivro, int anoPublicacao, int tempoDuracao) {
		super(idLivro, nomeLivro, autorLivro, anoPublicacao);
		this.tempoDuracao = tempoDuracao;
	}

	public int getTempoDuracao() {
		return tempoDuracao;
	}

	public void setTempoDuracao(int tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}

	@Override
	public String toString() {
		return "AudioBook [tempoDuracao=" + tempoDuracao + ", idLivro=" + idLivro + ", nomeLivro=" + nomeLivro
				+ ", autorLivro=" + autorLivro + ", anoPublicacao=" + anoPublicacao + "]";
	}

	
	
	
	
	
	

}
