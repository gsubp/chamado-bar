package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.table.DefaultTableModel;

import control.TabelaHandler;

public class TelaListaBar extends JFrame {

	private JTable table;
	private JScrollPane scroll;
	private DefaultTableModel model;

	public TelaListaBar() {
		super("Listar Bares");
		
		setLayout(new BorderLayout());
		model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("Nome");
		model.addColumn("Endereço");
		model.addColumn("Contato");
		model.addColumn("Observação");
		new TabelaHandler(this).inserirLinha();
		table = new JTable(model);
		
		scroll = new JScrollPane(table);		
		add(scroll,BorderLayout.CENTER);
		setSize(500, 400);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public DefaultTableModel getModel() {
		return model;
	}

	public void setModel(DefaultTableModel model) {
		this.model = model;
	}
	
	
}
