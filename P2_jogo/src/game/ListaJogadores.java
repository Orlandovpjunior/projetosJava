package game;

public class ListaJogadores {
	private String nome;
	private int poderDeAtaque;
	int vida;
	
	public ListaJogadores(String nome, int poderDeAtaque, int vida) {
		this.nome = nome;
		this.poderDeAtaque = poderDeAtaque;
		this.vida = vida;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPoderDeAtaque() {
		return poderDeAtaque;
	}

	public void setPoderDeAtaque(int poderDeAtaque) {
		this.poderDeAtaque = poderDeAtaque;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public void recebeDano(int dano) {
		this.vida -= dano;
		if(this.vida < 0) {
			this.vida = 0;
		}
	}
	
	public String toString() {
		return "Nome: " + this.nome + " / Poder de ataque: " + this.poderDeAtaque + " / Vida: " + this.vida + "\n---------------------";
	}

}
