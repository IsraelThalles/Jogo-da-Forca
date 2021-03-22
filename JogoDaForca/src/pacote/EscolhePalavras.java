package pacote;

import java.util.Random;

public class EscolhePalavras {
	private ListaDePalavras listaDePalavras = new ListaDePalavras(null);

	//Método para escolher uma palvra aleatória para ser descoberta.
	public void escolherPalavra(int i) {
		//Cada objeto recebe um vetor de String referente ao subtema escolhido.
		ModeloDeListaDePalavras nomeFeminino = new ListaDePalavras(listaDePalavras.getNomeFeminino());
		ModeloDeListaDePalavras nomeMasculino = new ListaDePalavras(listaDePalavras.getNomeMasculino());
		ModeloDeListaDePalavras paises = new ListaDePalavras(listaDePalavras.getPaises());
		ModeloDeListaDePalavras cidades = new ListaDePalavras(listaDePalavras.getCidades());
		ModeloDeListaDePalavras animais = new ListaDePalavras(listaDePalavras.getAnimais());
		ModeloDeListaDePalavras plantas = new ListaDePalavras(listaDePalavras.getPlantas());
		ModeloDeListaDePalavras esportes = new ListaDePalavras(listaDePalavras.getNomesEsportes());
		ModeloDeListaDePalavras times = new ListaDePalavras(listaDePalavras.getTimesFutebol());

		//Recebe o valor definido nos "case" 1 e 2 da classe Subtemas.
		switch(i) {
		/*Para cada caso, chama o método mostraPalavra() com um prâmetro diferente. Cada um possui
		um vetor de String referente ao subtema escolhido.*/
		case 1: 
			mostraPalavra(nomeFeminino);
			break;
		case 2:
			mostraPalavra(nomeMasculino);
			break;
		case 3:
			mostraPalavra(paises);
			break;
		case 4:
			mostraPalavra(cidades);
			break;
		case 5:
			mostraPalavra(animais);
			break;
		case 6:
			mostraPalavra(plantas);
			break;
		case 7:
			mostraPalavra(esportes);
			break;
		case 8:
			mostraPalavra(times);
			break;
		}
	}
	//Método para testar a palavra escolhida.
	public static void mostraPalavra(ModeloDeListaDePalavras subtema) {
		Random gerador = new Random();
		System.out.println("Palavra Oculta: "
	   		+ subtema.getPalavraOculta(gerador.nextInt(subtema.getpalavraOcultaTamanho())));
	}


}
