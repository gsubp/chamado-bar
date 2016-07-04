package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import control.TelaAtualizaBarHandler;

public class TelaAtualizaBar extends JFrame {
	private JPanel contentPane;
	private JTextField nomeField;
	private JTextField enderecoField;
	private JTextField contatoField;
	private JTextField obsField;
	private JComboBox<String> comboBox;
	private JButton btnAtualizar;

	
	public TelaAtualizaBar() {
		setResizable(false);
		setTitle("Atualizar Informações");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 250);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblBar = new JLabel("Bar:");
		lblBar.setForeground(Color.WHITE);
		
		comboBox = new JComboBox<String>(new TelaAtualizaBarHandler().bares());
		comboBox.setSelectedItem(0);
		comboBox.addItemListener(new TelaAtualizaBarHandler(this));
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(Color.WHITE);
		
		nomeField = new JTextField(10);
		
		JLabel lblEndereo = new JLabel("Endereço:");
		lblEndereo.setForeground(Color.WHITE);
		
		enderecoField = new JTextField(10);
		
		JLabel lblContato = new JLabel("Contato:");
		lblContato.setForeground(Color.WHITE);
		
		contatoField = new JTextField(10);
		
		JLabel lblObservao = new JLabel("Observa\u00E7\u00E3o:");
		lblObservao.setForeground(Color.WHITE);
		
		obsField = new JTextField(10);
		
		btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 13));
		btnAtualizar.setBackground(Color.WHITE);
		btnAtualizar.addActionListener(new TelaAtualizaBarHandler(this));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblBar)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(comboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblNome)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(nomeField, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblEndereo)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(enderecoField, GroupLayout.PREFERRED_SIZE, 321, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblContato)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(contatoField, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblObservao)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(obsField)))
						.addComponent(btnAtualizar))
					.addContainerGap(40, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBar)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(nomeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEndereo)
						.addComponent(enderecoField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblContato)
						.addComponent(contatoField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblObservao)
						.addComponent(obsField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnAtualizar)
					.addContainerGap(55, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		setVisible(true);
	}


	public JTextField getNomeField() {
		return nomeField;
	}


	public void setNomeField(JTextField nomeField) {
		this.nomeField = nomeField;
	}


	public JTextField getEnderecoField() {
		return enderecoField;
	}


	public void setEnderecoField(JTextField enderecoField) {
		this.enderecoField = enderecoField;
	}


	public JTextField getContatoField() {
		return contatoField;
	}


	public void setContatoField(JTextField contatoField) {
		this.contatoField = contatoField;
	}


	public JTextField getObsField() {
		return obsField;
	}


	public void setObsField(JTextField obsField) {
		this.obsField = obsField;
	}


	public JComboBox<String> getComboBox() {
		return comboBox;
	}


	public void setComboBox(JComboBox<String> comboBox) {
		this.comboBox = comboBox;
	}


	public JButton getBtnAtualizar() {
		return btnAtualizar;
	}


	public void setBtnAtualizar(JButton btnAtualizar) {
		this.btnAtualizar = btnAtualizar;
	}
}
