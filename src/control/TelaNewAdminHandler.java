package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import dao.CRUDUsers;
import model.Usuario;
import view.TelaNewAdmin;

public class TelaNewAdminHandler implements ActionListener {
	private TelaNewAdmin tela;
	
	public TelaNewAdminHandler(TelaNewAdmin tela) {
		super();
		this.tela = tela;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==tela.getCadButton())
			if(new CRUDUsers().inserir(new Usuario(tela.getLoginField().getText(),tela.getSenhaField().getText(),"Admin")))
				JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
			else
				JOptionPane.showMessageDialog(null, "Login já cadastrado!");
		if(e.getSource()==tela.getCancelButton()){
			tela.dispose();
			tela=null;
			System.gc();
		}
			
		
	}

}
