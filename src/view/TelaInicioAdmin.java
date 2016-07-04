package view;
import javax.swing.JButton;
import javax.swing.JFrame;
import control.TelaInicioAdminHandler;
import java.awt.Color;
import java.awt.Font;

public class TelaInicioAdmin extends JFrame{
	private JButton cadButton;
	private JButton buscaButton;
	private JButton listaButton;
	private JButton removeButton;
	private JButton newAdminButton;
	private JButton sairButton;
	
	public TelaInicioAdmin() {
		super("CHAMADO DO BAR - INÍCIO - ADMIN");		
		getContentPane().setFont(new Font("Tahoma", Font.BOLD, 11));
		getContentPane().setBackground(Color.BLACK);
		
		cadButton = new JButton("Cadastrar Bar");
		cadButton.setToolTipText("Cadastrar um novo bar");
		cadButton.setBackground(Color.WHITE);
		cadButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		cadButton.setBounds(25,25,150,75);
		cadButton.setVisible(true);
		cadButton.addActionListener(new TelaInicioAdminHandler(this));
		getContentPane().add(cadButton);
		
		buscaButton = new JButton("Atualizar");
		buscaButton.setToolTipText("Atualizar algum bar");
		buscaButton.setBackground(Color.WHITE);
		buscaButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		buscaButton.setBounds(25, 111, 150, 75);
		buscaButton.setVisible(true);
		buscaButton.addActionListener(new TelaInicioAdminHandler(this));
		getContentPane().add(buscaButton);
		
		listaButton = new JButton("Listar");
		listaButton.setToolTipText("Listar todos os bares");
		listaButton.setBackground(Color.WHITE);
		listaButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		listaButton.setBounds(185, 111, 150, 75);
		listaButton.setVisible(true);
		listaButton.addActionListener(new TelaInicioAdminHandler(this));
		getContentPane().add(listaButton);
		
		removeButton = new JButton("Remover");
		removeButton.setToolTipText("Remover algum bar");
		removeButton.setBackground(Color.WHITE);
		removeButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		removeButton.setBounds(345,25, 150,75);
		removeButton.setVisible(true);
		removeButton.addActionListener(new TelaInicioAdminHandler(this));
		getContentPane().add(removeButton);
		
		setSize(525, 240);
		getContentPane().setLayout(null);
		
		newAdminButton = new JButton("Novo Admin");
		newAdminButton.setToolTipText("Cadastrar um novo admin");
		newAdminButton.setBackground(Color.WHITE);
		newAdminButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		newAdminButton.setBounds(185, 25, 150, 75);
		newAdminButton.addActionListener(new TelaInicioAdminHandler(this));
		newAdminButton.setVisible(true);
		getContentPane().add(newAdminButton);
		
		sairButton = new JButton("Sair");
		sairButton.setToolTipText("Sair do Programa");
		sairButton.setBackground(Color.WHITE);
		sairButton.setFont(new Font("Tahoma", Font.BOLD, 18));
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
