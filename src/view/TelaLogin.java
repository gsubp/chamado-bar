package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.TelaLoginHandler;
import dao.Conexao;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseListener;
import java.awt.Color;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField loginField;
	private JTextField senhaField;
	private JLabel cadastroLabel;
	private JButton logarButton;
	private JButton sairButton;

	public TelaLogin() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 220, 149);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblLogin = new JLabel("Login:");
		
		loginField = new JTextField();
		loginField.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		
		senhaField = new JTextField();
		senhaField.setColumns(10);
		
		logarButton = new JButton("Logar");
		logarButton.addActionListener(new TelaLoginHandler(this));
		
		sairButton = new JButton("Sair");
		sairButton.addActionListener(new TelaLoginHandler(this));
		
		cadastroLabel = new JLabel("Não tenho cadastro");
		cadastroLabel.setForeground(Color.BLUE);
		cadastroLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		cadastroLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cadastroLabel.addMouseListener(new TelaLoginHandler(this));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblLogin)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(loginField, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblSenha)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(senhaField))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(logarButton, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
							.addComponent(sairButton, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(241, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(45)
					.addComponent(cadastroLabel)
					.addContainerGap(54, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLogin)
						.addComponent(loginField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSenha)
						.addComponent(senhaField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(logarButton)
						.addComponent(sairButton))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(cadastroLabel))
		);
		contentPane.setLayout(gl_contentPane);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Conexao c = new Conexao();
		c.getConnection();
		new TelaLogin();
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JTextField getLoginField() {
		return loginField;
	}

	public JTextField getSenhaField() {
		return senhaField;
	}

	public JLabel getCadastroLabel() {
		return cadastroLabel;
	}

	public JButton getLogarButton() {
		return logarButton;
	}

	public JButton getSairButton() {
		return sairButton;
	}
}
