package bibliotecaDeLivros;

public class LSENodeUsuario {
	// Atributos
    private Usuario info;
    private LSENodeUsuario prox;
// Método construtor      
    public LSENodeUsuario(Usuario valor) {
        this.info = valor;
    }
// Métodos SET
    public void setInfo(Usuario valor) {
        this.info = valor;
    }
    public void setProx(LSENodeUsuario novoProx) {
        this.prox = novoProx;
    }
// Métodos GET
    public Usuario getInfo() {
        return this.info;
    }
    public LSENodeUsuario getProx() {
        return this.prox;
    }

}
