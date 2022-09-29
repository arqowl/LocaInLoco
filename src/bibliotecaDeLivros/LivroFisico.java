package bibliotecaDeLivros;

public class LivroFisico extends Livro{
	private String ISBN;
	private String edicao;
	private int qtd;
	private ClassificaLivro Fisico;
	
	

	public LivroFisico(String idLivro, String nomeLivro, String iSBN, int qtd) {
		super(idLivro, nomeLivro);
		ISBN = iSBN;
		this.qtd = qtd;
	}

	public LivroFisico(String idLivro, String nomeLivro, String autorLivro, int anoPublicacao, String ISBN, String edicao, int qtd) {
		super(idLivro, nomeLivro, autorLivro, anoPublicacao);
		this.ISBN = ISBN;
		this.edicao = edicao;
		this.qtd = qtd;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	@Override
	public String toString() {
		return "LivroFisico [ISBN=" + ISBN + ", edicao=" + edicao + ", qtd=" + qtd + ", Classificação=" + Fisico + "]";
	}

	
	
	

}
