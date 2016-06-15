package control;

import java.util.ArrayList;

import view.TelaListaBar;
import model.Bar;
import dao.CRUDBares;

public class TabelaHandler {
	private TelaListaBar tela;

	public TabelaHandler(TelaListaBar tela) {
		super();
		this.tela = tela;
	}
	
	public void inserirLinha(){
		ArrayList<Bar> bares = new CRUDBares().listToArray();
		for(Bar bar : bares){
			
			tela.getModel().addRow(new Object[]{bar.getId(),bar.getNome(),bar.getEndereco(),bar.getContato(),bar.getObsBar()});
		}
	}
}
