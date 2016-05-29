package app;
import dao.Conexao;

public class App {
	
	public static void main(String[] args) {
		Conexao c = new Conexao();
		c.getConnection();
	}

}
