package view;


import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Color;

public class TelaCadBar extends JFrame {
	private JTextField nomeTField;
	private JTextField ruaTField;
	private JTextField numTField;
	private JTextField bairroTField;
	private JTextField cidadeTField;
	private JTextField estadoTField;
	private JTextField contatoTField;
	private JTextField obsTField;

	public TelaCadBar() {
		getContentPane().setBackground(new Color(255, 255, 204));
		getContentPane().setForeground(Color.BLACK);
		setResizable(false);
		setTitle("Tela de Cadastro");
		setVisible(true);
		setBounds(100, 100, 376, 275);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNome = new JLabel("Nome:");
		
		nomeTField = new JTextField();
		nomeTField.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		
		JLabel lblRua = new JLabel("Rua:");
		
		ruaTField = new JTextField();
		ruaTField.setColumns(10);
		
		JLabel lblN = new JLabel("N\u00FAmero:");
		
		numTField = new JTextField();
		numTField.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		
		bairroTField = new JTextField();
		bairroTField.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade:");
		
		cidadeTField = new JTextField();
		cidadeTField.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado:");
		
		estadoTField = new JTextField();
		estadoTField.setText("Ex.: PE");
		estadoTField.setColumns(10);
		
		JLabel lblContato = new JLabel("Contato:");
		
		contatoTField = new JTextField();
		contatoTField.setColumns(10);
		
		JLabel lblObservao = new JLabel("Observa\u00E7\u00E3o:");
		
		obsTField = new JTextField();
		obsTField.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		
		JButton btnCancelar = new JButton("Cancelar");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblEndereo)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblN)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(numTField, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblBairro)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(bairroTField, 206, 206, 206))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblContato)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(contatoTField, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(lblObservao)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(obsTField))
							.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
								.addComponent(lblCidade)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(cidadeTField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(96)
								.addComponent(lblEstado)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(estadoTField, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(lblNome)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(nomeTField))
							.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
								.addComponent(lblRua)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(ruaTField, 322, 322, 322))))
					.addContainerGap(19, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(66)
					.addComponent(btnCancelar)
					.addPreferredGap(ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
					.addComponent(btnCadastrar)
					.addGap(64))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(nomeTField, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblEndereo)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRua)
						.addComponent(ruaTField, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblN)
						.addComponent(lblBairro)
						.addComponent(bairroTField, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(numTField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCidade)
						.addComponent(lblEstado)
						.addComponent(estadoTField, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(cidadeTField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblContato)
						.addComponent(contatoTField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblObservao)
						.addComponent(obsTField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancelar)
						.addComponent(btnCadastrar))
					.addContainerGap(75, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}
}
