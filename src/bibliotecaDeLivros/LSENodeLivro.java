package bibliotecaDeLivros;

public class LSENodeLivro {
	// Atributos
    private Livro info;
    private LSENodeLivro prox;
// Método construtor      
    public LSENodeLivro(Livro valor) {
        this.info = valor;
    }
// Métodos SET
    public void setInfo(Livro valor) {
        this.info = valor;
    }
    public void setProx(LSENodeLivro novoProx) {
        this.prox = novoProx;
    }
// Métodos GET
    public Livro getInfo() {
        return this.info;
    }
    public LSENodeLivro getProx() {
        return this.prox;
    }
}
