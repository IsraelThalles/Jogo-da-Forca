package pacote;

import java.util.Scanner;

public class Subtemas {
	private String subtema1;
	private String subtema2;
	private int subtemaID;
	
	private Scanner ler = new Scanner(System.in);
	private Temas temas = new Temas();
	private EscolhePalavras escolhePalavras = new EscolhePalavras();
	
	//Método para escolher um subtema ou opção voltar.
	public int escolherSubtema(int tema) {
		/*Recebe um valor do método escolherTema() da classe Temas.
		Cada "case" para um tema diferente.*/
		switch(tema) {
		case 1:
			subtema1 = "Nomes femininos";
			subtema2 = "Nomes masculinos";
			break;
		case 2:
			subtema1 = "Países";
			subtema2 = "Cidades";
			break;
		case 3:
			subtema1 = "Animais";
			subtema2 = "Plantas";
			break;
		case 4:
			subtema1 = "Nomes de esportes";
			subtema2 = "Times de futebol";
			break;
		}
		/*Provisório, somente para testes. No futuro será por botões.
		Escolhe uma opção.*/
		do {
			System.out.println("Opções:\n"
					+ "1 → " + subtema1 + "\n"
					+ "2 → " + subtema2 + "\n"
					+ "3 → Voltar");
			subtemaID = ler.nextInt();
		} while(subtemaID < 1 || subtemaID > 3);
		//Retorna a opção escolhida para o método escolherTema() da classe Temas. 
		return subtemaID;
	}

	public void subtemaDeNomes(int subtemaID) {
		//Recebe um valor do método escolherTema() da classe Temas.
		switch(subtemaID) {
		case 1:
			/*Chama o método escolherPalavra() da classe EscolhePalavras passando como parâmetro
			um valor único para cada "case". O mesmo vale para cada caso 1 e 2 abaixo.*/
			escolhePalavras.escolherPalavra(1);
			break;
		case 2:
			escolhePalavras.escolherPalavra(2);
			break;
		case 3:
			temas.escolherTema();//Retorna para escolha dos temas.
			break;
		}
	}
	public void subtemaDeGeografia(int subtemaID) {
		switch(subtemaID) {
		case 1:
			escolhePalavras.escolherPalavra(3);
			break;
		case 2:
			escolhePalavras.escolherPalavra(4);
			break;
		case 3:
			temas.escolherTema();
			break;
		}

	}
	public void subtemaDeNatureza(int subtemaID) {
		switch(subtemaID) {
		case 1:
			escolhePalavras.escolherPalavra(5);
			break;
		case 2:
			escolhePalavras.escolherPalavra(6);
			break;
		case 3:
			temas.escolherTema();
			break;
		}

	}
	public void subtemaDeEsportes(int subtemaID) {
		switch(subtemaID) {
		case 1:
			escolhePalavras.escolherPalavra(7);
			break;
		case 2:
			escolhePalavras.escolherPalavra(8);
			break;
		case 3:
			temas.escolherTema();
			break;
		}
	}
}
