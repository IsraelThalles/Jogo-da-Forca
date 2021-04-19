package modelo;

public abstract class ModeloDeListaDePalavras {
	private String palavraOculta[];

	public ModeloDeListaDePalavras(String[] strings) {
		setPalavraOculta(strings);
	}

	public String getPalavraOculta(int i) {
		return palavraOculta[i];
	}

	public void setPalavraOculta(String[] palavraOculta) {
		this.palavraOculta = palavraOculta;
	}
	public int getpalavraOcultaTamanho() {
		return palavraOculta.length;
	}

}
