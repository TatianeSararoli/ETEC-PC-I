package view;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculadora extends JFrame {
	
JTextField txtVisor = new JTextField();
	
	JButton btnMC = new JButton("MC");
	JButton btnMR = new JButton("MR");
	JButton btnMS = new JButton("MS");
	JButton btnMMais = new JButton("M+");
	JButton btnMMenos = new JButton("M-");
	JButton btnBksp = new JButton("Bksp");
	JButton btnCE = new JButton("CE");
	JButton btnC = new JButton("C");
	JButton btnMaisMenos = new JButton("±");
	JButton btnRaiz = new JButton("√");
	JButton btnSete = new JButton("7");
	JButton btnOito = new JButton("8");
	JButton btnNove = new JButton("9");
	JButton btnDiv = new JButton("/");
	JButton btnPorc = new JButton("%");
	JButton btnQuatro = new JButton("4");
	JButton btnCinco = new JButton("5");
	JButton btnSeis = new JButton("6");
	JButton btnMult = new JButton("*");
	JButton btnUmx = new JButton("1/x");
	JButton btnHum = new JButton("1");
	JButton btnDois = new JButton("2");
	JButton btnTres = new JButton("3");
	JButton btnMenos = new JButton("-");
	JButton btnIgual = new JButton("=");
	JButton btnZero = new JButton("0");
	JButton btnVirg = new JButton(",");
	JButton btnMais = new JButton("+");
	
	public Calculadora() {
		super ("Calculadora");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		txtVisor.setBounds(10, 30, 195, 51);
		paine.add(txtVisor);
		
		btnMC.setBounds(10, 86, 33, 27);
		paine.add(btnMC);
		
		btnMR.setBounds(50, 86, 33, 27);
		paine.add(btnMR);
		
		btnMS.setBounds(90, 86, 33, 27);
		paine.add(btnMS);
		
		btnMMais.setBounds(130, 86, 33, 27);
		paine.add(btnMMais);
		
		btnMMenos.setBounds(170, 86, 33, 27);
		paine.add(btnMMenos);
		
		btnBksp.setBounds(210, 116, 33, 27);
		paine.add(btnBksp);
		
		btnCE.setBounds(250, 116, 33, 27);
		paine.add(btnCE);
		
		btnC.setBounds(290, 116, 33, 27);
		paine.add(btnC);
		
		btnMaisMenos.setBounds(20, 116, 33, 27);
		paine.add(btnMaisMenos);
		
		btnRaiz.setBounds(20, 116, 33, 27);
		paine.add(btnRaiz);
		
		btnSete.setBounds(10, 146, 33, 27);
		paine.add(btnSete);
		
		btnOito.setBounds(20, 20, 33, 27);
		paine.add(btnOito);
		
		btnNove.setBounds(20, 20, 33, 27);
		paine.add(btnNove);
		
		btnDiv.setBounds(20, 20, 33, 27);
		paine.add(btnDiv);
		
		btnPorc.setBounds(20, 20, 33, 27);
		paine.add(btnPorc);
		
		btnQuatro.setBounds(10, 176, 33, 27);
		paine.add(btnQuatro);
		
		btnCinco.setBounds(20, 20, 33, 27);
		paine.add(btnCinco);
		
		btnSeis.setBounds(20, 20, 33, 27);
		paine.add(btnSeis);
		
		btnMult.setBounds(20, 20, 33, 27);
		paine.add(btnMult);
		
		btnUmx.setBounds(20, 20, 33, 27);
		paine.add(btnUmx);
		
		btnHum.setBounds(10, 206, 33, 27);
		paine.add(btnHum);
		
		btnDois.setBounds(20, 20, 33, 27);
		paine.add(btnDois);
		
		btnTres.setBounds(20, 20, 33, 27);
		paine.add(btnTres);
		
		btnMenos.setBounds(20, 20, 33, 27);
		paine.add(btnMenos);
		
		btnIgual.setBounds(20, 20, 33, 27);
		paine.add(btnIgual);
		
		btnZero.setBounds(10, 236, 33, 27);
		paine.add(btnZero);
		
		btnVirg.setBounds(20, 20, 33, 27);
		paine.add(btnVirg);
		
		btnMais.setBounds(20, 20, 33, 27);
		paine.add(btnMais);
	
		/*btnMC.setMargin(new Insets(1,1,1,1));
		btnMC.setFont( new Font( "Arial", FONT.PLAIN, 12 ) );
		seuJButton.setBorder(null);
		seuJButton.setContentAreaFilled(false);*/
			
		this.setSize(218, 312);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);	
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calc = new Calculadora();

	}

}
