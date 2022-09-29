package bibliotecaDeLivros;

public class Ebook extends Livro{
	private String linkDownload;
	private int numeroPaginas;
	
	
	public Ebook(String idLivro, String nomeLivro, String linkDownload, int numeroPaginas) {
		super(idLivro, nomeLivro);
		this.linkDownload = linkDownload;
		this.numeroPaginas = numeroPaginas;
	}


	public Ebook(String idLivro, String nomeLivro, String autorLivro, int anoPublicacao, String linkDownload,
			int numeroPaginas) {
		super(idLivro, nomeLivro, autorLivro, anoPublicacao);
		this.linkDownload = linkDownload;
		this.numeroPaginas = numeroPaginas;
	}


	public String getLinkDownload() {
		return linkDownload;
	}


	public void setLinkDownload(String linkDownload) {
		this.linkDownload = linkDownload;
	}


	public int getNumeroPaginas() {
		return numeroPaginas;
	}


	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}


	@Override
	public String toString() {
		return "Ebook [linkDownload=" + linkDownload + ", numeroPaginas=" + numeroPaginas + ", idLivro=" + idLivro
				+ ", nomeLivro=" + nomeLivro + ", autorLivro=" + autorLivro + ", anoPublicacao=" + anoPublicacao + "]";
	}
	
	
	

}
