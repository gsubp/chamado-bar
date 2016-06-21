package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.TelaAtualizaBar;
import view.TelaCadBar;
import view.TelaInicioAdmin;
import view.TelaListaBar;
import view.TelaNewAdmin;
import view.TelaRemoveBar;

public class TelaInicioAdminHandler implements ActionListener{
	private TelaInicioAdmin tela;
	
	public TelaInicioAdminHandler(TelaInicioAdmin tela) {
		this.tela=tela;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==tela.getCadButton())
			new TelaCadBar();
		if(e.getSource()==tela.getBuscaButton())
			new TelaAtualizaBar();
		if(e.getSource()==tela.getRemoveButton())
			new TelaRemoveBar();
		if(e.getSource()==tela.getListaButton())
			new TelaListaBar();
		if(e.getSource()==tela.getNewAdminButton())
			new TelaNewAdmin();
		if(e.getSource()==tela.getSairButton())
			System.exit(0);
	}

}
