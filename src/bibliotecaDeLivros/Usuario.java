package bibliotecaDeLivros;

public class Usuario implements Comparable<Usuario>{
	private String nomeCompleto;
	private String CPF;
	
	
	public Usuario(String nomeCompleto, String CPF) {
		this.nomeCompleto = nomeCompleto;
		this.CPF = CPF;
	}


	public Usuario(String CPF) {
		this.CPF = CPF;
	}




	public String getNomeCompleto() {
		return nomeCompleto;
	}


	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}


	public String getCPF() {
		return CPF;
	}


	public void setCPF(String cPF) {
		CPF = cPF;
	}


	@Override
	public String toString() {
		return "Usuario [nomeCompleto=" + nomeCompleto + ", CPF=" + CPF + "]";
	}
	
    @Override
    public int compareTo (Usuario al) {
        int result;
        result = this.getCPF().compareTo(al.getCPF());
        return result;
    }
	
	
	
	
	

}
