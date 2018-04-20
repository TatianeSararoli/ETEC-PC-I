package exemplo;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Tela extends JFrame {
	
	JTextArea txtTexto = new JTextArea(15,30);
	JScrollPane barra = new JScrollPane(txtTexto);
	
	public Tela() {
		super ("Exemplo de Tela");
		
		Container pane = this.getContentPane();
		pane.setLayout(null);
		
		barra.setBounds(20, 20, 360, 150);
		pane.add(barra);
		
		this.setResizable(false);
		this.setVisible(true);
		this.setSize(400, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}

	public static void main(String[] args) {
		Tela tela = new Tela();
	}

}
