package agenda;

public class Contato {
	private int posicao;
	private String nome;
	private String sobrenome;
	private String telefone;

	public Contato(int posicao,String nome, String sobrenome, String telefone) {
		this.posicao = posicao;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return this.sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public int getPosicao() {
		return this.posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	
	public String toString() {
		return this.posicao + "," + this.nome + "," + this.sobrenome + "," + this.telefone;
	}

}
