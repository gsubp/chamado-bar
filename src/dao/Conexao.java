package dao;
 
import java.sql.Connection; 
import java.sql.DriverManager;
//import java.sql.Statement;
 
public class Conexao{
	Connection con;
	// private Connection oConn;
	// private Statement sStmt;
  
  
	public Connection getConnection(){
		try{
				Class.forName("com.mysql.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/chamado_bar";
				con = DriverManager.getConnection(url,"root","1234");
				System.out.println("Conexao efetuada com sucesso");
				return con;
		}
		catch(Exception e){
			System.out.println("Erro ao abrir conexao com banco:");
			e.printStackTrace();
			return null;
		}
	}
	
	public void closeAll(){
		try{
			con.close();
			System.out.println("Conexao finalizada com sucesso");
		}
		catch(Exception e){
			System.out.println("Erro ao fechar conexao com banco" + e.getMessage());
		}
	}
}