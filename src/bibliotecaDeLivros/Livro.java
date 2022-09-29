package bibliotecaDeLivros;

public class Livro implements Comparable<Livro>{
	protected String idLivro;
	protected String nomeLivro;
	protected String autorLivro;
	protected int anoPublicacao;


	
	public Livro(String idLivro, String nomeLivro) {
		super();
		this.idLivro = idLivro;
		this.nomeLivro = nomeLivro;
	}

	public Livro(String idLivro) {
		this.idLivro = idLivro;
	}
	
	


	public Livro(String idLivro, String nomeLivro, String autorLivro, int anoPublicacao) {
		this.idLivro = idLivro;
		this.nomeLivro = nomeLivro;
		this.autorLivro = autorLivro;
		this.anoPublicacao = anoPublicacao;
	}

	public String getAutorLivro() {
		return autorLivro;
	}

	public void setAutorLivro(String autorLivro) {
		this.autorLivro = autorLivro;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public String getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(String idLivro) {
		this.idLivro = idLivro;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	

	@Override
    public int compareTo (Livro al) {
        int result;
        result = this.getIdLivro().compareTo(al.getIdLivro());
        return result;
    }
	

}
