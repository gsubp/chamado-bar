package view;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.TelaCadUserHandler;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class TelaCadUser extends JFrame {

	private JPanel contentPane;
	private JTextField loginField;
	private JTextField senhaField;
	private JRadioButton donoBarRB;
	private JRadioButton usuarioRB;
	private JButton cadastrarButton; 
	private JButton cancelarButton;
	private TelaLogin tela;
	
	public TelaCadUser(TelaLogin tela) {
		this.tela=tela;
		tela.setVisible(false);
		setTitle("Novo Usuário");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 295, 135);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setForeground(Color.WHITE);
		
		loginField = new JTextField();
		loginField.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setForeground(Color.WHITE);
		
		senhaField = new JTextField();
		senhaField.setColumns(10);
		
		JLabel lblEuSou = new JLabel("Eu sou:");
		lblEuSou.setForeground(Color.WHITE);
		
		ButtonGroup group = new ButtonGroup();
		
		donoBarRB = new JRadioButton("Dono de bar",true);
		donoBarRB.setBackground(Color.BLACK);
		donoBarRB.setForeground(Color.WHITE);
		
		usuarioRB = new JRadioButton("Usuário comum",false);
		usuarioRB.setBackground(Color.BLACK);
		usuarioRB.setForeground(Color.WHITE);
		
		group.add(donoBarRB);
		group.add(usuarioRB);
		
		
		cadastrarButton = new JButton("Cadastrar");
		cadastrarButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		cadastrarButton.setBackground(Color.WHITE);
		cadastrarButton.addActionListener(new TelaCadUserHandler(this));
		
		cancelarButton = new JButton("Cancelar");
		cancelarButton.setBackground(Color.WHITE);
		cancelarButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		cancelarButton.addActionListener(new TelaCadUserHandler(this));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblLogin)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(loginField))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblSenha)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(senhaField, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(cancelarButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(cadastrarButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblEuSou)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(donoBarRB)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(usuarioRB)))
					.addContainerGap(169, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLogin)
						.addComponent(loginField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(cadastrarButton))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSenha)
						.addComponent(senhaField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(cancelarButton))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEuSou)
						.addComponent(donoBarRB)
						.addComponent(usuarioRB))
					.addContainerGap(174, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}

	

	public JTextField getLoginField() {
		return loginField;
	}

	public JTextField getSenhaField() {
		return senhaField;
	}

	public JRadioButton getDonoBarRB() {
		return donoBarRB;
	}

	public JRadioButton getUsuarioRB() {
		return usuarioRB;
	}

	public JButton getCadastrarButton() {
		return cadastrarButton;
	}

	public JButton getCancelarButton() {
		return cancelarButton;
	}

	public TelaLogin getTela() {
		return tela;
	}

	public void setTela(TelaLogin tela) {
		this.tela = tela;
	}
}
