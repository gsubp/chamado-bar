package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

import dao.CRUDUsers;
import model.Usuario;
import view.TelaCadUser;
import view.TelaDono;
import view.TelaInicioAdmin;
import view.TelaLogin;

public class TelaLoginHandler implements ActionListener,MouseListener {
	private TelaLogin tela;	

	public TelaLoginHandler(TelaLogin tela) {
		super();
		this.tela = tela;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Usuario user = new CRUDUsers().logar(tela.getLoginField().getText());
		if(e.getSource()==tela.getSairButton())
			System.exit(0);
		if(e.getSource()==tela.getLogarButton()){
			if(user==null){
				JOptionPane.showMessageDialog(null,"Usuário não enontrado");
				tela.getLoginField().setText(null);
				tela.getSenhaField().setText(null);
			}
			else{
				if(user.getLogin().equals(tela.getLoginField().getText())&&user.getSenha().equals(tela.getSenhaField().getText())){
					JOptionPane.showMessageDialog(null,"Logado com Sucesso.");
					if(user.getPersp().equals("Admin"))
						new TelaInicioAdmin();
					if(user.getPersp().equals("Dono de Bar"))
						new TelaDono();
//					if(user.getPersp().equals("Comum")))
						
					tela.dispose();
					tela=null;
					System.gc();
				}
				else{
					JOptionPane.showMessageDialog(null,"Login/senha incorretos");
					tela.getLoginField().setText(null);
					tela.getSenhaField().setText(null);
				}
			}
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {new TelaCadUser(tela);}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
}
