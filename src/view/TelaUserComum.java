package view;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import control.TelaUserComumHandler;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;

public class TelaUserComum extends JFrame {

	private JPanel contentPane;
	private JButton cadButton;
	private JButton listaButton;
	private JButton sairButton;
	
	public TelaUserComum() {
		setBackground(Color.RED);
		setResizable(false);
		setTitle("CHAMADO DO BAR - USUÁRIO COMUM");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 502, 145);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		cadButton = new JButton("Novo Bar");
		cadButton.setToolTipText("Cadastrar um novo bar");
		cadButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		cadButton.setBorderPainted(false);
		cadButton.setBackground(Color.WHITE);
		cadButton.addActionListener(new TelaUserComumHandler(this));
		
		listaButton = new JButton("Listar");
		listaButton.setToolTipText("Listar todos os bares");
		listaButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		listaButton.setBackground(Color.WHITE);
		listaButton.addActionListener(new TelaUserComumHandler(this));
		
		sairButton = new JButton("Sair");
		sairButton.setToolTipText("Sair do Programa");
		sairButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		sairButton.setBackground(Color.WHITE);
		sairButton.addActionListener(new TelaUserComumHandler(this));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(cadButton, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(listaButton, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(sairButton, GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
					.addGap(6))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
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
