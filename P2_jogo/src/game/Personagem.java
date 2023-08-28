package game;

public class Personagem {
	private String nome;
	private int poderDeAtaque;
	private int vida;
	private ListaJogadores[] players;
	private int quantidade;

	public Personagem(int quantidade) {
		this.players = new ListaJogadores[quantidade];
	}
	
	public void adicionaPersonagem(String nome, int poderDeAtaque, int vida) {
		this.players[quantidade] = new ListaJogadores(nome, poderDeAtaque, vida);
		this.quantidade += 1;
	}
	
	public String escolhePersonagem(String n) {
		String out = "";
		for(ListaJogadores i: players) {
			if(i.getNome().equals(n)) {
				out = i.getNome();
			}
		}
		return out;
	}
	
	public int poderDeAtaque(String n) {
		int poder = 0;
		for(ListaJogadores i : players) {
			if(i.getNome().equals(n)) {
				poder = i.getPoderDeAtaque();
			}
		}
		return poder;
	}
	
	public void ataque(String n,int escolhido, int atacado, int dano){
	    if(escolhido > atacado) {
	    	String personagem = escolhePersonagem(n);
	    	for(ListaJogadores i : players) {
	    		if(i.getNome().equals(personagem)) {
	    			i.recebeDano(dano);
	    			break;
	    		}
	    	}
	    }else {
	    	System.out.println("O Personagem que você escolheu possui um poder de ataque maior do que o seu, seu ataque não surtirá efeito");
	    }
	}
	
	@Override
	public String toString() {
		String out = "Personagens:\n";
		for(ListaJogadores i : players) {
			out += "Nome: " +  i.getNome() + " / Poder de ataque: " + i.getPoderDeAtaque() + " / Vida: " + i.getVida() + "\n------------------" + "\n";
		}
		return out;
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

	public ListaJogadores[] getPlayers() {
		return players;
	}

	public void setPlayers(ListaJogadores[] players) {
		this.players = players;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
