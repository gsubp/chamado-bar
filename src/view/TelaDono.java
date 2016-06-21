package view;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.TelaDonoHandler;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;

public class TelaDono extends JFrame {

	private JPanel contentPane;
	private JButton cadButton;
	private JButton atualizaButton;
	private JButton listaButton;
	private JButton removeButton;
	private JButton sairButton;
	
	public TelaDono() {
		setResizable(false);
		setTitle("CHAMADO DO BAR -  DONO DE BAR");

		setBounds(100, 100, 366, 247);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		cadButton = new JButton("Cadastrar Bar");
		cadButton.setToolTipText("Cadastrar um novo bar");
		cadButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		cadButton.setBackground(Color.WHITE);
		cadButton.addActionListener(new TelaDonoHandler(this));
		
		atualizaButton = new JButton("Atualizar");
		atualizaButton.setToolTipText("Atualize seu bar");
		atualizaButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		atualizaButton.setBackground(Color.WHITE);
		atualizaButton.addActionListener(new TelaDonoHandler(this));
		
		listaButton = new JButton("Listar");
		listaButton.setToolTipText("Listar todos os bares");
		listaButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		listaButton.setBackground(Color.WHITE);
		listaButton.addActionListener(new TelaDonoHandler(this));
		
		removeButton = new JButton("Remover");
		removeButton.setToolTipText("Remover seu bar");
		removeButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		removeButton.setBackground(Color.WHITE);
		removeButton.addActionListener(new TelaDonoHandler(this));
		
		sairButton = new JButton("Sair");
		sairButton.setToolTipText("Sair do Programa");
		sairButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		sairButton.setBackground(Color.WHITE);
		sairButton.addActionListener(new TelaDonoHandler(this));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(listaButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(cadButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(removeButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(atualizaButton, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(122)
							.addComponent(sairButton, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(79, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(atualizaButton, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
						.addComponent(cadButton, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(removeButton, GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
						.addComponent(listaButton, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(sairButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(8))
		);
		contentPane.setLayout(gl_contentPane);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	public JButton getCadButton() {
		return cadButton;
	}

	public JButton getAtualizaButton() {
		return atualizaButton;
	}

	public JButton getListaButton() {
		return listaButton;
	}

	public JButton getRemoveButton() {
		return removeButton;
	}

	public JButton getSairButton() {
		return sairButton;
	}
}
