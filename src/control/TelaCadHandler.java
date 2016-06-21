package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.CRUDBares;
import model.Bar;
import view.TelaCadBar;

public class TelaCadHandler implements ActionListener{
	TelaCadBar tela;

	public TelaCadHandler(TelaCadBar tela) {
		super();
		this.tela = tela;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String endereco = tela.getRuaTField().getText()+", "+tela.getNumTField().getText()+", "+tela.getCidadeTField().getText()+" - "+tela.getEstadoTField().getText();
		Bar bar = new Bar(tela.getNomeTField().getText(), endereco, tela.getContatoTField().getText(), tela.getObsTField().getText());
		new CRUDBares().inserir(bar);		
	}
	
	
}
