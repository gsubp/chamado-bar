package view;

import java.awt.Cursor;

import javax.swing.JButton;
import javax.swing.JFrame;

import control.TelaInicioAdminHandler;

public class TelaInicioAdmin extends JFrame{
	private JButton cadButton;
	private JButton buscaButton;
	private JButton listaButton;
	private JButton removeButton;
	private JButton newAdminButton;
	private JButton sairButton;
	
	public TelaInicioAdmin() {
		super("CHAMADO DO BAR - INÍCIO - ADMIN");		
		
		cadButton = new JButton("Cadastrar novo bar");
		cadButton.setBounds(25,25,150,75);
		cadButton.setVisible(true);
		cadButton.addActionListener(new TelaInicioAdminHandler(this));
		getContentPane().add(cadButton);
		
		buscaButton = new JButton("Atualizar");
		buscaButton.setBounds(25, 111, 150, 75);
		buscaButton.setVisible(true);
		buscaButton.addActionListener(new TelaInicioAdminHandler(this));
		getContentPane().add(buscaButton);
		
		listaButton = new JButton("Listar");
		listaButton.setBounds(185, 111, 150, 75);
		listaButton.setVisible(true);
		listaButton.addActionListener(new TelaInicioAdminHandler(this));
		getContentPane().add(listaButton);
		
		removeButton = new JButton("Remover");
		removeButton.setBounds(345,25, 150,75);
		removeButton.setVisible(true);
		removeButton.addActionListener(new TelaInicioAdminHandler(this));
		getContentPane().add(removeButton);
		
		setSize(525, 240);
		getContentPane().setLayout(null);
		
		newAdminButton = new JButton("Novo Admin");
		newAdminButton.setBounds(185, 25, 150, 75);
		newAdminButton.addActionListener(new TelaInicioAdminHandler(this));
		newAdminButton.setVisible(true);
		getContentPane().add(newAdminButton);
		
		sairButton = new JButton("Sair");
		sairButton.setBounds(345, 111, 150, 75);
		sairButton.setVisible(true);
		sairButton.addActionListener(new TelaInicioAdminHandler(this));
		getContentPane().add(sairButton);
		
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	public JButton getCadButton() {
		return cadButton;
	}

	public void setCadButton(JButton cadButton) {
		this.cadButton = cadButton;
	}

	public JButton getBuscaButton() {
		return buscaButton;
	}

	public void setBuscaButton(JButton buscaButton) {
		this.buscaButton = buscaButton;
	}

	public JButton getListaButton() {
		return listaButton;
	}

	public void setListaButton(JButton listaButton) {
		this.listaButton = listaButton;
	}

	public JButton getRemoveButton() {
		return removeButton;
	}

	public void setRemoveButton(JButton removeButton) {
		this.removeButton = removeButton;
	}

	public JButton getNewAdminButton() {
		return newAdminButton;
	}

	public JButton getSairButton() {
		return sairButton;
	}
}
