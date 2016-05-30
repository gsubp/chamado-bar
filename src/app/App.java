package app;
import view.TelaCadBar;
import dao.Conexao;

public class App {
	
	public static void main(String[] args) {
		Conexao c = new Conexao();
		c.getConnection();
		new TelaCadBar();
	}

}
