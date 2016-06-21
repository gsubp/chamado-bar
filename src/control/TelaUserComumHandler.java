package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.TelaCadBar;
import view.TelaListaBar;
import view.TelaUserComum;

public class TelaUserComumHandler implements ActionListener {
	private TelaUserComum tela;
	
	public TelaUserComumHandler(TelaUserComum tela) {
		super();
		this.tela = tela;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==tela.getCadButton())
			new TelaCadBar();
		if(e.getSource()==tela.getListaButton())
			new TelaListaBar();
		if(e.getSource()==tela.getSairButton())
			System.exit(0);

	}

}
