package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.TelaAtualizaBar;
import view.TelaCadBar;
import view.TelaDono;
import view.TelaListaBar;
import view.TelaRemoveBar;

public class TelaDonoHandler implements ActionListener {
	private TelaDono tela;
	
	public TelaDonoHandler(TelaDono tela) {
		super();
		this.tela = tela;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==tela.getCadButton())
			new TelaCadBar();
		if(e.getSource()==tela.getListaButton())
			new TelaListaBar();
		if(e.getSource()==tela.getRemoveButton())
			new TelaRemoveBar();
		if(e.getSource()==tela.getAtualizaButton())
			new TelaAtualizaBar();
		if(e.getSource()==tela.getSairButton())
			System.exit(0);

	}

}
