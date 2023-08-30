package agenda;

/**
 * Uma agenda que mantém uma lista de contatos com posições. Podem existir 100 contatos. 
 * 
 * @author nazareno
 *
 */
public class Agenda {
	
	private static final int TAMANHO_AGENDA = 100;
	
	private Contato [] contatos; //apenas uma simplificacao de contato

	/**
	 * Cria uma agenda.
	 */
	public Agenda() {
		this.contatos = new Contato[TAMANHO_AGENDA];
	}
	
	/**
	 * Acessa a lista de contatos mantida.
	 * @return O array de contatos.
	 */
	public Contato[] getContatos() {
		return contatos.clone();
	}

	/**
	 * Acessa os dados de um contato específico.
	 * @param posicao Posição do contato na agenda.
	 * @return Dados do contato. Null se não há contato na posição.
	 */
	public Contato getContato(int posicao) {
		return this.contatos[posicao];
	}

	/**
	 * Cadastra um contato em uma posição. Um cadastro em uma posição que já existe sobrescreve o anterior. 
	 * @param posicao Posição do contato.
	 * @param nome Nome do contato.
	 * @param sobrenome Sobrenome do contato.
	 * @param telefone Telefone do contato.
	 */
	public void cadastraContato(int posicao, String nome, String sobrenome, String telefone) {
		boolean cadastrado = false;
		boolean nomeVazio = false;
		boolean telefoneVazio = false;
		for (Contato i : contatos) {
		    if (i != null && i.getPosicao() == posicao) {
		        System.out.println("POSIÇÃO INVÁLIDA");
		        cadastrado = true;
		        break;
		    }else if(i != null && i.getNome().equals(nome) && i.getSobrenome().equals(sobrenome)) {
		    	System.out.println("CONTATO JA CADASTRADO");
		    	cadastrado = true;
		    	break;
		    }else if (i != null && nome.equals("")) {
		        System.out.println("CONTATO INVALIDO");
		        nomeVazio = true;
		        break;
		    }else if (i != null && telefone.equals("")) {
		        System.out.println("CONTATO INVALIDO");
		        telefoneVazio = true;
		        break;
		    }
		}
		
		if(cadastrado == false && nomeVazio == false && telefoneVazio == false) {
			this.contatos[posicao] = new Contato(posicao,nome,sobrenome,telefone);
		}
	}

}

