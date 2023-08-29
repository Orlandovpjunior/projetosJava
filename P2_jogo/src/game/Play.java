package game;
import java.util.*;
/**
 * @autor Orlando junior
 */
public class Play {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos personagens você deseja criar??");
		int quantidade = Integer.parseInt(sc.nextLine());
		Personagem p = new Personagem(quantidade);
		int aux = 0;
		do{
			System.out.println("Qual o nome do seu personagem? Essa mensagem se repetirá: " + quantidade + " vezes");
			String nome = sc.nextLine();
			System.out.println("Qual o seu poder de ataque?");
			int poderDeAtaque = Integer.parseInt(sc.nextLine());
			System.out.println("Qual a sua quantidade de vida?");
			int vida = Integer.parseInt(sc.nextLine());
			p.adicionaPersonagem(nome, poderDeAtaque, vida);
			aux += 1;
		}while(aux < quantidade);
		System.out.println("Com qual jogador você deseja jogar?");
		String escolha = sc.nextLine();
		int ataqueDoJogadorEscolhido = p.poderDeAtaque(escolha);
		System.out.println("Você escolheu jogar com: " + p.escolhePersonagem(escolha));
		System.out.println("Que possui um poder de ataque de: " + ataqueDoJogadorEscolhido);
		System.out.println("Qual personagem você deseja atacar? Digite seu nome");
		String escolhaDeAtaque = sc.nextLine();
		int ataqueDoAtacado = p.poderDeAtaque(escolhaDeAtaque);
		System.out.println("Você escolheu atacar o personagem: " + p.escolhePersonagem(escolhaDeAtaque));
		System.out.println("O poder de ataque desse personagem é de: " + ataqueDoAtacado);
		System.out.println("Quanto de dano você deseja causar?");
		int dano = Integer.parseInt(sc.nextLine());
		p.ataque(escolhaDeAtaque,ataqueDoJogadorEscolhido,ataqueDoAtacado,dano);
		System.out.println(p.toString());
	}
}
