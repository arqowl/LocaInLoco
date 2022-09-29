package bibliotecaDeLivros;

public class LSENodeLivro {
	// Atributos
    private Livro info;
    private LSENodeLivro prox;
// M�todo construtor      
    public LSENodeLivro(Livro valor) {
        this.info = valor;
    }
// M�todos SET
    public void setInfo(Livro valor) {
        this.info = valor;
    }
    public void setProx(LSENodeLivro novoProx) {
        this.prox = novoProx;
    }
// M�todos GET
    public Livro getInfo() {
        return this.info;
    }
    public LSENodeLivro getProx() {
        return this.prox;
    }
}
