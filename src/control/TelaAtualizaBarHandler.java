package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import view.TelaAtualizaBar;
import model.Bar;
import dao.CRUDBares;

public class TelaAtualizaBarHandler implements ActionListener, ItemListener {
	private TelaAtualizaBar tela;
	
	public  TelaAtualizaBarHandler() {}
	
	public TelaAtualizaBarHandler(TelaAtualizaBar tela){
		this.tela=tela;
	}
	

	@Override
	public void itemStateChanged(ItemEvent arg0) {		
		Bar bar = new CRUDBares().buscar(tela.getComboBox().getSelectedItem().toString());
		
		tela.getNomeField().setText(bar.getNome());
		tela.getEnderecoField().setText(bar.getEndereco());
		tela.getContatoField().setText(bar.getContato());
		tela.getObsField().setText(bar.getObsBar());

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Bar bar = new Bar(tela.getNomeField().getText(),tela.getEnderecoField().getText(), tela.getContatoField().getText(), tela.getObsField().getText());
		if(new CRUDBares().atualizar(bar))
			JOptionPane.showMessageDialog(null, "Informações Atualizadas");
		else
			JOptionPane.showMessageDialog(null, "Informações Não Atualizadas");
	}
	
	public String[] bares(){
		ArrayList<Bar> baresArray = new CRUDBares().listToArray();
		String[] bares = new String[baresArray.size()+1];
		bares[0]="Selecione o bar";
		for(int i=1;i<bares.length;i++){
			bares[i]=baresArray.get(i-1).getNome();
		}
		return bares;
	}

}
