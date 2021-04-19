package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Random;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import controle.Operacoes;
import modelo.ListaDePalavras;
import modelo.ModeloDeListaDePalavras;
import java.awt.BorderLayout;

public class TelaPrincipal {	
	private JPanel telaPrincipal = new JPanel();
	private JButton voltar = new JButton("Voltar");
	private JLabel forca = new JLabel();
	private ImageIcon forca0 = new ImageIcon(TelaPrincipal.class.getResource("/imagem/0.png"));
	private ImageIcon forca1 = new ImageIcon(TelaPrincipal.class.getResource("/imagem/1.png"));
	private ImageIcon forca2 = new ImageIcon(TelaPrincipal.class.getResource("/imagem/2.png"));
	private ImageIcon forca3 = new ImageIcon(TelaPrincipal.class.getResource("/imagem/3.png"));
	private ImageIcon forca4 = new ImageIcon(TelaPrincipal.class.getResource("/imagem/4.png"));
	private Teclado teclado = new Teclado();
	private JButton a=teclado.getA();
	private JButton b=teclado.getB();
	private JButton c=teclado.getC();
	private JButton d=teclado.getD();
	private JButton e=teclado.getE();
	private JButton f=teclado.getF();
	private JButton g=teclado.getG();
	private JButton h=teclado.getH();
	private JButton i=teclado.getI();
	private JButton j=teclado.getJ();
	private JButton k=teclado.getK();
	private JButton l=teclado.getL();
	private JButton m=teclado.getM();
	private JButton n=teclado.getN();
	private JButton o=teclado.getO();
	private JButton p=teclado.getP();
	private JButton q=teclado.getQ();
	private JButton r=teclado.getR();
	private JButton s=teclado.getS();
	private JButton t=teclado.getT();
	private JButton u=teclado.getU();
	private JButton v=teclado.getV();
	private JButton w=teclado.getW();
	private JButton x=teclado.getX();
	private JButton y=teclado.getY();
	private JButton z=teclado.getZ();
	private JLabel imagemDeFundo = new JLabel();
	private JPanel painelPalavra = new JPanel();
	private JLabel palavraEscolhida = new JLabel();

	public TelaPrincipal() {
		voltar.setBounds(20, 20, 80, 57);
		forca.setHorizontalAlignment(SwingConstants.CENTER);
		forca.setBounds(450, 105, 322, 345);
		
		painelPalavra.setBackground(new Color(0, 0, 0, 0));
		painelPalavra.setBounds(260, 46, 680, 39);
		painelPalavra.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		palavraEscolhida.setFont(new Font("Choco cooky", Font.BOLD, 24));
		painelPalavra.add(palavraEscolhida);

		voltar.setFont(new Font("Choco cooky", Font.BOLD, 14));
		voltar.setContentAreaFilled(false);
		voltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		voltar.setBorderPainted(false);
		voltar.setHorizontalTextPosition(SwingConstants.CENTER);
		voltar.setBackground(new Color(0,0,0,0));
		voltar.setIcon(new ImageIcon(TelaSubtemas.class.getResource("/imagem/BotaoVoltar.png")));

		forca.setIcon(forca0);

		telaPrincipal.setSize(1200, 660);
		telaPrincipal.setLayout(null);
		telaPrincipal.setBackground(new Color(0, 88, 200));
		
		imagemDeFundo.setBounds(0, 0, 1200, 660);
		imagemDeFundo.setIcon(new ImageIcon(Janela.class.getResource("/imagem/PlanoDeFundo.jpg")));

		telaPrincipal.add(voltar);
		telaPrincipal.add(forca);
		telaPrincipal.add(teclado.getTeclado());
		telaPrincipal.add(painelPalavra);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagem/PlacaParaPalavra.png")));
		lblNewLabel.setBounds(260, 40, 680, 60);
		telaPrincipal.add(lblNewLabel);
		telaPrincipal.add(imagemDeFundo);

	}

	public void setForca(int numErros) {
		
		switch(numErros) {
		
		case 0:
			forca.setIcon(forca0);

			break;
		case 1:
			forca.setIcon(forca1);

			break;
		case 2:
			forca.setIcon(forca2);

			break;
		case 3:
			forca.setIcon(forca3);

			break;
		case 4:
			forca.setIcon(forca4);

			break;

		}
		
	}
	
	public void setPalavraEscolhida(String palavraEscolhida) {
		this.palavraEscolhida.setText(palavraEscolhida);
	}

	public JPanel getTelaPrincipal() {
		return telaPrincipal;
	}

	public JButton getVoltar() {
		return voltar;
	}

	public JButton getA() {
		return a;
	}

	public JButton getB() {
		return b;
	}

	public JButton getC() {
		return c;
	}

	public JButton getD() {
		return d;
	}

	public JButton getE() {
		return e;
	}

	public JButton getF() {
		return f;
	}

	public JButton getG() {
		return g;
	}

	public JButton getH() {
		return h;
	}

	public JButton getI() {
		return i;
	}

	public JButton getJ() {
		return j;
	}

	public JButton getK() {
		return k;
	}

	public JButton getL() {
		return l;
	}

	public JButton getM() {
		return m;
	}

	public JButton getN() {
		return n;
	}

	public JButton getO() {
		return o;
	}

	public JButton getP() {
		return p;
	}

	public JButton getQ() {
		return q;
	}

	public JButton getR() {
		return r;
	}

	public JButton getS() {
		return s;
	}

	public JButton getT() {
		return t;
	}

	public JButton getU() {
		return u;
	}

	public JButton getV() {
		return v;
	}

	public JButton getW() {
		return w;
	}

	public JButton getX() {
		return x;
	}

	public JButton getY() {
		return y;
	}

	public JButton getZ() {
		return z;
	}
	
	public void reabilitarBotoes(Boolean variavel) {
		a.setEnabled(variavel);
		b.setEnabled(variavel);
		c.setEnabled(variavel);
		d.setEnabled(variavel);
		e.setEnabled(variavel);
		f.setEnabled(variavel);
		g.setEnabled(variavel);
		h.setEnabled(variavel);
		i.setEnabled(variavel);
		j.setEnabled(variavel);
		k.setEnabled(variavel);
		l.setEnabled(variavel);
		m.setEnabled(variavel);
		n.setEnabled(variavel);
		o.setEnabled(variavel);
		p.setEnabled(variavel);
		q.setEnabled(variavel);
		r.setEnabled(variavel);
		s.setEnabled(variavel);
		t.setEnabled(variavel);
		u.setEnabled(variavel);
		v.setEnabled(variavel);
		w.setEnabled(variavel);
		x.setEnabled(variavel);
		y.setEnabled(variavel);
		z.setEnabled(variavel);
	}
}
