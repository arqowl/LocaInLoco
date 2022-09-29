package bibliotecaDeLivros;

public class LSENodeUsuario {
	// Atributos
    private Usuario info;
    private LSENodeUsuario prox;
// M�todo construtor      
    public LSENodeUsuario(Usuario valor) {
        this.info = valor;
    }
// M�todos SET
    public void setInfo(Usuario valor) {
        this.info = valor;
    }
    public void setProx(LSENodeUsuario novoProx) {
        this.prox = novoProx;
    }
// M�todos GET
    public Usuario getInfo() {
        return this.info;
    }
    public LSENodeUsuario getProx() {
        return this.prox;
    }

}
