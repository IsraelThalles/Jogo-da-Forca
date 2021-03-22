package pacote;

import java.util.Scanner;

public class Temas {
	private int x;
	private Iniciar iniciar = new Iniciar();
	private Subtemas subtemas = new Subtemas();
	private Scanner ler = new Scanner(System.in);
	
	//Método para escolher tema e redirecionar para escolha de subtemas ou para tela inicial.
	public void escolherTema() {
		
		/*Provisório, somente para testes. No futuro será por botões.
		Escolhe uma opção.*/
		do {
			System.out.println("Opções:\n"
					+ "1 → Nomes\n"
					+ "2 → Geogrefia\n"
					+ "3 → Natureza\n"
					+ "4 → Esportes\n"
					+ "5 → Voltar\n");

			x = ler.nextInt();
		} while(x < 1 || x > 5);
		
		//Cada "case" para uma opção diferente.
		switch(x) {
		case 1:
			/*Chama o método escolherSubtema() passando como parâmetro a opção escolhida
			e substitui o valor de x pelo valor retornado*/
			x = subtemas.escolherSubtema(x);
			/*Chama o método, da classe Subtemas, referente ao tema escolhido passando
			como parâmetro o novo valor de x*/
			subtemas.subtemaDeNomes(x);
			break;
		//O mesmo para os outros "case", exceto no case 5.
		case 2:
			x = subtemas.escolherSubtema(x);
			subtemas.subtemaDeGeografia(x);
			break;
		case 3:
			x = subtemas.escolherSubtema(x);
			subtemas.subtemaDeNatureza(x);
			break;
		case 4:
			x = subtemas.escolherSubtema(x);
			subtemas.subtemaDeEsportes(x);
			break;
		case 5:
			iniciar.main(null);//Retorna para tela inicial.
			break;
		}
	}
}
