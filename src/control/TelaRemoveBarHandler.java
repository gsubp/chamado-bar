package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JOptionPane;

import dao.CRUD;
import view.TelaRemoveBar;

public class TelaRemoveBarHandler implements ActionListener {
	private TelaRemoveBar tela;
	
	public  TelaRemoveBarHandler(TelaRemoveBar tela) {
		this.tela=tela;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(tela.getComboBox().getSelectedIndex()==0)
			JOptionPane.showMessageDialog(null, "Selecione um Bar!!");
		else{
			String nome = tela.getComboBox().getSelectedItem().toString();
			if(new CRUD().remover(nome))
				JOptionPane.showMessageDialog(null, "Bar Removido");
			else
				JOptionPane.showMessageDialog(null, "Bar Não Removido");
			tela.dispose();
			tela=null;
			tela= new TelaRemoveBar();
		}
			
		
	}

}
