package bibliotecaDeLivros;

public class LSELivro {
	// Atributo

    private LSENodeLivro primeiro;

// Métodos públicos
    public boolean isEmpty() {
        // Testa se a lista está vazia
        if (this.primeiro == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public void remover(String matr) {
        Livro proc = new Livro(matr);
        LSENodeLivro atual, anterior;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else if (this.primeiro.getProx() == null) {
            if (proc.compareTo(this.primeiro.getInfo()) == 0) {
                this.primeiro = null;
                System.out.println("Remoção efetuada");
            } else {
                System.out.println("Livro não encontrado!");
            }
        } else { // lista com mais de um nó
            if (proc.compareTo(this.primeiro.getInfo()) == 0) { // remoção do primeiro
                this.primeiro = this.primeiro.getProx();
                System.out.println("Remoção efetuada");
            } else {
                anterior = null;
                atual = this.primeiro;
                while (atual != null) {
                   if (atual.getInfo().compareTo(proc) != 0 ) {
                    anterior = atual;
                    atual = atual.getProx();
                   }
                   else {
                       break; // achou!!!
                   }
                }
                if (atual == null) {
                    System.out.println("Valor não pertence a lidta!");
                }
                else {
                    anterior.setProx(atual.getProx());
                    System.out.println("Remoção efetuada!");
                }
            }
        }
        }

    public void inserirLivro(Livro al) {
        LSENodeLivro novo;
        // Verifica, usando a função "buscar" se o Livro já é cadastrado
        LSENodeLivro result = this.buscar(al);
        if (result != null) {
            System.out.println("Livro já existe na lista!");
        } else {
            // Cria e preenche um novo nó com o Livro que foi passado como parâmetro
            novo = new LSENodeLivro(al);
            // Insere um novo Livro no início da lista de Livros
            if (this.isEmpty() == true) {
                this.primeiro = novo;
            } else {
                novo.setProx(this.primeiro);
                this.primeiro = novo;
            }
            System.out.println("Inserção efetuada!");
        }
    }

    public void inserirLivroFinal(Livro al) {
        LSENodeLivro novo, aux;
        // Verifica, usando a função "buscar" se o Livro já é cadastrado
        LSENodeLivro result = this.buscar(al);
        if (result != null) {
            System.out.println("Livro já existe na lista!");
        } else {
            // Cria e preenche um novo nó com o Livro que foi passado como parâmetro
            novo = new LSENodeLivro(al);
            // Insere um novo Livro no final da lista de Livros
            if (this.isEmpty() == true) {
                this.primeiro = novo;
            } else {
                aux = this.primeiro;
                while (aux.getProx() != null) {
                    aux = aux.getProx();
                }
                aux.setProx(novo);
            }
            System.out.println("Inserção efetuada!");
        }
    }

    private LSENodeLivro buscar(Livro al) {
        LSENodeLivro aux;
        if (this.isEmpty() == true) {
            return null;
        } else {
            aux = this.primeiro;
            while (aux != null) {
                if (aux.getInfo().compareTo(al) == 0) {
                    return aux;
                } else {
                    aux = aux.getProx();
                }
            }
            return null;
        }
    }

    public void exibir() {
        // Exibe o conteúdo de todos os nós da lista
        LSENodeLivro aux;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }
    }

}
