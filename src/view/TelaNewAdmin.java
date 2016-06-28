package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.TelaNewAdminHandler;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Color;

public class TelaNewAdmin extends JFrame {

	private JPanel contentPane;
	private JTextField loginField;
	private JTextField senhaField;
	private JButton cadButton;
	private JButton cancelButton;

	public TelaNewAdmin() {
		
		setTitle("Novo Admin");
		
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
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
		
		cadButton = new JButton("Cadastrar");
		cadButton.setBackground(Color.WHITE);
		cadButton.addActionListener(new TelaNewAdminHandler(this));
		
		cancelButton = new JButton("Cancelar");
		cancelButton.setBackground(Color.WHITE);
		cancelButton.addActionListener(new TelaNewAdminHandler(this));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblLogin)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(loginField, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(cadButton))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblSenha)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(senhaField, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(cancelButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addContainerGap(183, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLogin)
						.addComponent(loginField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(cadButton))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSenha)
						.addComponent(senhaField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(cancelButton))
					.addContainerGap(200, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 270, 115);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public JTextField getLoginField() {
		return loginField;
	}

	public JTextField getSenhaField() {
		return senhaField;
	}

	public JButton getCadButton() {
		return cadButton;
	}

	public JButton getCancelButton() {
		return cancelButton;
	}
}
