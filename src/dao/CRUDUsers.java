package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Statement;
import model.Usuario;

public class CRUDUsers {
	Statement stmt;
	public Usuario logar(String login){
		try{
			stmt = (Statement) Conexao.con.createStatement();			
			ResultSet rs = stmt.executeQuery("select * from users where login = '"+login+"';");			
			while(rs.next()){
				return new Usuario(rs.getString("login"),rs.getString("senha"),rs.getString("persp"));				
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean inserir(Usuario user){
		 try {
	         stmt = (Statement) Conexao.con.createStatement();   	
			 stmt.executeUpdate("INSERT INTO users (login,senha,persp) VALUES "
			 		+ "('" + user.getLogin() + "','"
	                    + user.getSenha() + "','"
	                    + user.getPersp()+ "')");
	 
	         return true; 
		 } catch (SQLException e) {
			 e.printStackTrace();
		 }
		 return false;
		 
	}
}
