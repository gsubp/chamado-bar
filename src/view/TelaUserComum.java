package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.TelaUserComumHandler;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class TelaUserComum extends JFrame {

	private JPanel contentPane;
	private JButton cadButton;
	private JButton listaButton;
	private JButton sairButton;
	
	public TelaUserComum() {
		setResizable(false);
		setTitle("CHAMADO DO BAR - USUÁRIO COMUM");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 502, 145);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		cadButton = new JButton("Novo Bar");
		cadButton.addActionListener(new TelaUserComumHandler(this));
		
		listaButton = new JButton("Listar");
		listaButton.addActionListener(new TelaUserComumHandler(this));
		
		sairButton = new JButton("Sair");
		sairButton.addActionListener(new TelaUserComumHandler(this));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(cadButton, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(listaButton, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(sairButton, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(cadButton, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
						.addComponent(listaButton, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
						.addComponent(sairButton, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
					.addGap(159))
		);
		contentPane.setLayout(gl_contentPane);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public JButton getCadButton() {
		return cadButton;
	}

	public JButton getListaButton() {
		return listaButton;
	}

	public JButton getSairButton() {
		return sairButton;
	}

}
