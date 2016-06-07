package view;

import java.util.ArrayList;

import model.Bar;
import dao.CRUD;

public class TabelaHandler {
	private TelaListaBar tela;

	public TabelaHandler(TelaListaBar tela) {
		super();
		this.tela = tela;
	}
	
	public void inserirLinha(){
		ArrayList<Bar> bares = new CRUD().listToArray();
		for(Bar bar : bares){
			
			tela.getModel().addRow(new Object[]{bar.getId(),bar.getNome(),bar.getEndereco(),bar.getContato(),bar.getObsBar()});
		}
	}
}
