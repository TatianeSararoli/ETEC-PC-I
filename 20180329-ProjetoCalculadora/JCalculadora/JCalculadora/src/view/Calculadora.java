package view;

import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;

import calculos.FuncoesMatematicas;

public class Calculadora extends JFrame {

ButtonGroup tipo = new ButtonGroup ();
	
	JMenu Exibir = new JMenu("Exibir");
	JRadioButtonMenuItem radipadrao = new JRadioButtonMenuItem("Padão");
	JRadioButtonMenuItem radicienti = new JRadioButtonMenuItem ("Científica");
	JRadioButtonMenuItem radiprograma = new JRadioButtonMenuItem ("Programador");
	JRadioButtonMenuItem radiestatist = new JRadioButtonMenuItem ("Estatística");
	JCheckBoxMenuItem cbAgrupamento = new JCheckBoxMenuItem ("Agrupamento de Digitos");
		
	JMenu Editar = new JMenu("Editar");
	JMenu Ajuda = new JMenu("Ajuda");
	
JMenuBar menuBar = new JMenuBar();
	
JTextField txtVisor = new JTextField("0");
	
	JButton btnMC = new JButton("MC");
	JButton btnMR = new JButton("MR");
	JButton btnMS = new JButton("MS");
	JButton btnMMais = new JButton("M+");
	JButton btnMMenos = new JButton("M-");
	JButton btnBksp = new JButton("<---");
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
	
	FuncoesMatematicas mat = new FuncoesMatematicas();
	String sinal = null;
	double valor1 = 0, valor2 = 0;
	
	public Calculadora() {
		super ("Calculadora");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		menuBar.setBounds(0, 0, 228, 25);
		paine.add(menuBar);
		
		Exibir.setFont( new Font( "Arial", Font.PLAIN, 12 ));
		Exibir.setBounds(1, 5, 45, 20);
		menuBar.add(Exibir);
		Exibir.add(radipadrao);
		Exibir.add(radicienti);
		Exibir.add(radiprograma);
		Exibir.add(radiestatist);
		Exibir.addSeparator();
		Exibir.add("Histórico       Crtl + H");
		Exibir.add(cbAgrupamento);
		Exibir.addSeparator();
		
		Editar.setFont( new Font( "Arial", Font.PLAIN, 12 ));
		Editar.setBounds(46, 5, 45, 20);
		menuBar.add(Editar);
		
		Ajuda.setFont( new Font( "Arial", Font.PLAIN, 12 ));
		Ajuda.setBounds(91, 5, 45, 20);
		menuBar.add(Ajuda);
		
		txtVisor.setFont( new Font( "Arial", Font.PLAIN, 20 ) );
		txtVisor.setBounds(10, 30, 195, 51);
		paine.add(txtVisor);
		
		btnMC.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMC.setMargin(new Insets(1,1,1,1));
		btnMC.setBounds(10, 86, 33, 27);
		paine.add(btnMC);

		btnMR.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMR.setMargin(new Insets(1,1,1,1));
		btnMR.setBounds(50, 86, 33, 27);
		paine.add(btnMR);
		
		btnMS.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMS.setMargin(new Insets(1,1,1,1));
		btnMS.setBounds(90, 86, 33, 27);
		paine.add(btnMS);
		
		btnMMais.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMMais.setMargin(new Insets(1,1,1,1));
		btnMMais.setBounds(130, 86, 33, 27);
		paine.add(btnMMais);
		btnMMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sinal = "soma";
			}
		});
		
		btnMMenos.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMMenos.setMargin(new Insets(1,1,1,1));
		btnMMenos.setBounds(170, 86, 33, 27);
		paine.add(btnMMenos);
		
		btnBksp.setFont( new Font( "Wide Latin", Font.PLAIN, 12 ) );
		btnBksp.setMargin(new Insets(1,1,1,1));
		btnBksp.setBounds(10, 119, 33, 27);
		paine.add(btnBksp);
		
		btnCE.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnCE.setMargin(new Insets(1,1,1,1));
		btnCE.setBounds(50, 119, 33, 27);
		paine.add(btnCE);
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText("0");
			}
		});
		
		btnC.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnC.setMargin(new Insets(1,1,1,1));
		btnC.setBounds(90, 119, 33, 27);
		paine.add(btnC);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText("0");
			}
		});
		
		btnMaisMenos.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMaisMenos.setMargin(new Insets(1,1,1,1));
		btnMaisMenos.setBounds(130, 119, 33, 27);
		paine.add(btnMaisMenos);
		
		btnRaiz.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnRaiz.setMargin(new Insets(1,1,1,1));
		btnRaiz.setBounds(170, 119, 33, 27);
		paine.add(btnRaiz);
		
		btnSete.setFont( new Font( "Arial", Font.PLAIN, 15 ) );
		btnSete.setMargin(new Insets(1,1,1,1));
		btnSete.setBounds(10, 152, 33, 27);
		paine.add(btnSete);
		btnSete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText(txtVisor.getText() + "7");
				}
				else {
					txtVisor.setText("7");
				}
			}
		});
		
		btnOito.setFont( new Font( "Arial", Font.PLAIN, 15 ) );
		btnOito.setMargin(new Insets(1,1,1,1));
		btnOito.setBounds(50, 152, 33, 27);
		paine.add(btnOito);
		btnOito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText(txtVisor.getText() + "8");
				}
				else {
					txtVisor.setText("8");
				}
			}
		});
		
		btnNove.setFont( new Font( "Arial", Font.PLAIN, 15 ) );
		btnNove.setMargin(new Insets(1,1,1,1));
		btnNove.setBounds(90, 152, 33, 27);
		paine.add(btnNove);
		btnNove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText(txtVisor.getText() + "9");
				}
				else {
					txtVisor.setText("9");
				}
			}
		});
		
		btnDiv.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnDiv.setMargin(new Insets(1,1,1,1));
		btnDiv.setBounds(130, 152, 33, 27);
		paine.add(btnDiv);
		
		btnPorc.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnPorc.setMargin(new Insets(1,1,1,1));
		btnPorc.setBounds(170, 152, 33, 27);
		paine.add(btnPorc);
		
		btnQuatro.setFont( new Font( "Arial", Font.PLAIN, 15 ) );
		btnQuatro.setMargin(new Insets(1,1,1,1));
		btnQuatro.setBounds(10, 185, 33, 27);
		paine.add(btnQuatro);
		btnQuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText(txtVisor.getText() + "4");
				}
				else {
					txtVisor.setText("4");
				}
			}
		});
		
		btnCinco.setFont( new Font( "Arial", Font.PLAIN, 15 ) );
		btnCinco.setMargin(new Insets(1,1,1,1));
		btnCinco.setBounds(50, 185, 33, 27);
		paine.add(btnCinco);
		btnCinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText(txtVisor.getText() + "5");
				}
				else {
					txtVisor.setText("5");
				}
			}
		});
		
		btnSeis.setFont( new Font( "Arial", Font.PLAIN, 15 ) );
		btnSeis.setMargin(new Insets(1,1,1,1));
		btnSeis.setBounds(90, 185, 33, 27);
		paine.add(btnSeis);
		btnSeis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText(txtVisor.getText() + "6");
				}
				else {
					txtVisor.setText("6");
				}
			}
		});
		
		btnMult.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMult.setMargin(new Insets(1,1,1,1));
		btnMult.setBounds(130, 185, 33, 27);
		paine.add(btnMult);
		
		btnUmx.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnUmx.setMargin(new Insets(1,1,1,1));
		btnUmx.setBounds(170, 185, 33, 27);
		paine.add(btnUmx);
		
		btnHum.setFont( new Font( "Arial", Font.PLAIN, 15 ) );
		btnHum.setMargin(new Insets(1,1,1,1));
		btnHum.setBounds(10, 218, 33, 27);
		paine.add(btnHum);
		btnHum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText(txtVisor.getText() + "1");
				}
				else {
					txtVisor.setText("1");
				}
			}
		});
		
		btnDois.setFont( new Font( "Arial", Font.PLAIN, 15 ) );
		btnDois.setMargin(new Insets(1,1,1,1));
		btnDois.setBounds(50, 218, 33, 27);
		paine.add(btnDois);
		btnDois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText(txtVisor.getText() + "2");
				}
				else {
					txtVisor.setText("2");
				}
			}
		});
		
		btnTres.setFont( new Font( "Arial", Font.PLAIN, 15 ) );
		btnTres.setMargin(new Insets(1,1,1,1));
		btnTres.setBounds(90, 218, 33, 27);
		paine.add(btnTres);
		btnTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText(txtVisor.getText() + "3");
				}
				else {
					txtVisor.setText("3");
				}
			}
		});
		
		btnMenos.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMenos.setMargin(new Insets(1,1,1,1));
		btnMenos.setBounds(130, 218, 33, 27);
		paine.add(btnMenos);
		
		btnIgual.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnIgual.setMargin(new Insets(1,1,1,1));
		btnIgual.setBounds(170, 218, 33, 60);
		paine.add(btnIgual);
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor2 = Double.parseDouble(txtVisor.getText());
				if(sinal.equals("soma")) {
					txtVisor.setText(mat.soma(valor1, valor2) + "");
				}
			}
		});
		
		btnZero.setFont( new Font( "Arial", Font.PLAIN, 15 ) );
		btnZero.setMargin(new Insets(1,1,1,1));
		btnZero.setBounds(10, 251, 73, 27);
		paine.add(btnZero);
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText(txtVisor.getText() + "0");
				}
				else {
					txtVisor.setText("0");
				}
			}
		});
		
		btnVirg.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnVirg.setMargin(new Insets(1,1,1,1));
		btnVirg.setBounds(90, 251, 33, 27);
		paine.add(btnVirg);
		
		btnMais.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMais.setMargin(new Insets(1,1,1,1));
		btnMais.setBounds(130, 251, 33, 27);
		paine.add(btnMais);
		btnMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				sinal = "soma";
				txtVisor.setText("0");
			}
		});
			
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