package view;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import control.TelaCadHandler;
import java.awt.Color;
import java.awt.Font;

public class TelaCadBar extends JFrame {
	private JTextField nomeTField;
	private JTextField ruaTField;
	private JTextField numTField;
	private JTextField bairroTField;
	private JTextField cidadeTField;
	private JTextField estadoTField;
	private JTextField contatoTField;
	private JTextField obsTField;
	private JButton btnCadastrar;

	public TelaCadBar() {
		getContentPane().setBackground(Color.BLACK);
		getContentPane().setForeground(Color.BLACK);
		setResizable(false);
		setTitle("Tela de Cadastro");
		setVisible(true);
		setBounds(100, 100, 390, 272);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(Color.WHITE);
		
		nomeTField = new JTextField();
		nomeTField.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setForeground(Color.WHITE);
		
		JLabel lblRua = new JLabel("Rua:");
		lblRua.setForeground(Color.WHITE);
		
		ruaTField = new JTextField();
		ruaTField.setColumns(10);
		
		JLabel lblN = new JLabel("N\u00FAmero:");
		lblN.setForeground(Color.WHITE);
		
		numTField = new JTextField();
		numTField.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setForeground(Color.WHITE);
		
		bairroTField = new JTextField();
		bairroTField.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setForeground(Color.WHITE);
		
		cidadeTField = new JTextField();
		cidadeTField.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setForeground(Color.WHITE);
		lblEstado.setBackground(Color.BLACK);
		
		estadoTField = new JTextField();
		estadoTField.setText("Ex.: PE");
		estadoTField.setColumns(10);
		
		JLabel lblContato = new JLabel("Contato:");
		lblContato.setForeground(Color.WHITE);
		
		contatoTField = new JTextField();
		contatoTField.setColumns(10);
		
		JLabel lblObservao = new JLabel("Observa\u00E7\u00E3o:");
		lblObservao.setForeground(Color.WHITE);
		
		obsTField = new JTextField();
		obsTField.setColumns(10);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCadastrar.addActionListener(new TelaCadHandler(this));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnCadastrar, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEndereo)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblContato)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(contatoTField, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblObservao)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(obsTField, 284, 284, 284))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNome)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(nomeTField, 315, 315, 315))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblRua)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(ruaTField, GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblCidade)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(cidadeTField))
								.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
									.addComponent(lblN)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(numTField, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblBairro)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblEstado)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(estadoTField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(bairroTField, GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))))
					.addGap(24))
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
						.addComponent(cidadeTField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEstado)
						.addComponent(estadoTField, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblContato)
						.addComponent(contatoTField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblObservao)
						.addComponent(obsTField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnCadastrar, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(14, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}
	
	public JTextField getNomeTField() {
		return nomeTField;
	}

	public JTextField getRuaTField() {
		return ruaTField;
	}

	public JTextField getNumTField() {
		return numTField;
	}

	public JTextField getBairroTField() {
		return bairroTField;
	}

	public JTextField getCidadeTField() {
		return cidadeTField;
	}

	public JTextField getEstadoTField() {
		return estadoTField;
	}

	public JTextField getContatoTField() {
		return contatoTField;
	}

	public JTextField getObsTField() {
		return obsTField;
	}
}
