package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.CRUDUsers;
import model.Usuario;
import view.TelaCadUser;

public class TelaCadUserHandler implements ActionListener {
	private TelaCadUser tela;
	private String persp;
	
	public TelaCadUserHandler(TelaCadUser tela) {
		this.tela=tela;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==tela.getDonoBarRB())
			persp = tela.getDonoBarRB().getText();
		if(e.getSource()==tela.getUsuarioRB())
			persp = tela.getUsuarioRB().getText();		
		if(e.getSource()==tela.getCadastrarButton()){
			if(new CRUDUsers().inserir(new Usuario(tela.getLoginField().getText(), tela.getSenhaField().getText(), persp))){
				JOptionPane.showMessageDialog(null, "Cadastrado com sucesso.");
				tela.setVisible(false);
				tela.getTela().setVisible(true);
				tela.dispose();
			}
		}
		if(e.getSource()==tela.getCancelarButton()){
			tela.setVisible(false);
			tela.getTela().setVisible(true);
			tela.dispose();
			tela=null;
			System.gc();
		}
	}
}
