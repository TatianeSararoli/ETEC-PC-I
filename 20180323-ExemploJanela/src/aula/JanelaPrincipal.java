package aula;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JanelaPrincipal extends JFrame {
	
	JLabel lblTitulo = new JLabel("Preencha os campos e clique em Gravar Dados");
	JLabel lblNome = new JLabel("Nome: ");
	JLabel lblEndereco = new JLabel("Endereço: ");
	JLabel lblBairro = new JLabel("Bairro: ");
	JLabel lblEstado = new JLabel("Estado: ");
	JLabel lblTelefone = new JLabel("Telefone: ");
	JLabel lblCelular = new JLabel("Celular: ");
	JLabel lblEmail = new JLabel("Email: ");
	JTextField txtNome = new JTextField();
	JTextField txtEndereco = new JTextField();
	JTextField txtBairro = new JTextField();
	JTextField txtTelefone = new JTextField();
	JTextField txtCelular = new JTextField();
	JTextField txtEmail = new JTextField();
	JComboBox cboEstado = new JComboBox();
	JButton btnGravCad = new JButton("Gravar Cadastro");
	JButton btnNovoCad = new JButton("Novo Cadastro");
	JButton btnVerCad = new JButton("Ver Cadastros");
	
	public JanelaPrincipal() {
		super ("Cadastro de Clientes");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		lblTitulo.setBounds(175, 25, 300, 50);
		paine.add(lblTitulo);
		
		lblNome.setBounds(100, 75, 130, 50);
		paine.add(lblNome);
		
		lblEndereco.setBounds(100, 125, 130, 50);
		paine.add(lblEndereco);
		
		lblBairro.setBounds(100, 175, 130, 50);
		paine.add(lblBairro);
		
		lblEstado.setBounds(100, 225, 130, 50);
		paine.add(lblEstado);
		
		lblTelefone.setBounds(100, 275, 130, 50);
		paine.add(lblTelefone);
		
		lblCelular.setBounds(100, 325, 130, 50);
		paine.add(lblCelular);
		
		lblEmail.setBounds(100, 375, 130, 50);
		paine.add(lblEmail);
		
		txtNome.setBounds(225, 90, 275, 25);
		paine.add(txtNome);
				
		txtEndereco.setBounds(225, 140, 275, 25);
		paine.add(txtEndereco);
				
		txtBairro.setBounds(225, 190, 275, 25);
		paine.add(txtBairro);
		
		txtTelefone.setBounds(225, 290, 150, 25);
		paine.add(txtTelefone);
				
		txtCelular.setBounds(225, 340, 150, 25);
		paine.add(txtCelular);
				
		txtEmail.setBounds(225, 390, 275, 25);
		paine.add(txtEmail);
		
		cboEstado.addItem("AC");
		cboEstado.addItem("AL");
		cboEstado.addItem("AP");
		cboEstado.addItem("AM");
		cboEstado.addItem("AC");
		cboEstado.addItem("BA");
		cboEstado.addItem("CE");
		cboEstado.addItem("DF");
		cboEstado.addItem("ES");
		cboEstado.addItem("GO");
		cboEstado.addItem("MA");
		cboEstado.addItem("MT");
		cboEstado.addItem("MS");
		cboEstado.addItem("MG");
		cboEstado.addItem("PA");
		cboEstado.addItem("PB");
		cboEstado.addItem("PR");
		cboEstado.addItem("PE");
		cboEstado.addItem("PI");
		cboEstado.addItem("RJ");
		cboEstado.addItem("RN");
		cboEstado.addItem("RS");
		cboEstado.addItem("RO");
		cboEstado.addItem("RR");
		cboEstado.addItem("SC");
		cboEstado.addItem("SP");
		cboEstado.addItem("SE");
		cboEstado.addItem("TO");
		
		cboEstado.setBounds(225, 240, 200, 25);
		paine.add(cboEstado);
		
		btnGravCad.setBounds(75, 450, 130, 50);
		paine.add(btnGravCad);
		
		btnNovoCad.setBounds(225, 450, 130, 50);
		paine.add(btnNovoCad);
		
		btnVerCad.setBounds(375, 450, 130, 50);
		paine.add(btnVerCad);
		
		this.setVisible(true);
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JanelaPrincipal janela = new JanelaPrincipal();

	}

}