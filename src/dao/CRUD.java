package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Statement;

import model.Bar;

public class CRUD {
	Statement stmt;
	
	public void inserir(Bar bar){
		 try {
	         stmt = (Statement) Conexao.con.createStatement();   	
			 stmt.executeUpdate("INSERT INTO bares (nome,endereco,contato,obsBar) VALUES "
			 		+ "('" + bar.getNome() + "','"
	                    + bar.getEndereco() + "','"
	                    + bar.getContato() + "','"
	                    + bar.getObsBar() + "')");
	 
	            JOptionPane.showMessageDialog(null, "Bar cadastrado com sucesso.");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	}
	
	public Bar buscar(String nome){
		try{
			stmt = (Statement) Conexao.con.createStatement();			
			ResultSet rs = stmt.executeQuery("select * from bares where nome = '"+nome+"';");			
			while(rs.next()){
				String nomeB= rs.getString("nome");
				String endereco = rs.getString("endereco");
				String contato = rs.getString("contato");
				String obs = rs.getString("obsBar");
				return new Bar(nomeB,endereco,contato,obs);				
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return null;
	}
	
	public ArrayList<Bar> listToArray(){
		ArrayList<Bar> bares = new ArrayList<>();		
		try{
			stmt = (Statement) Conexao.con.createStatement();			
			ResultSet rs = stmt.executeQuery("select * from bares;");
			
			while(rs.next()){
				String id = rs.getString("id");
				String nomeB= rs.getString("nome");
				String endereco = rs.getString("endereco");
				String contato = rs.getString("contato");
				String obs = rs.getString("obsBar");
				bares.add(new Bar(id,nomeB, endereco, contato, obs));			
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return bares;
	}
	
	public boolean atualizar(Bar bar){
		try{
			stmt = (Statement) Conexao.con.createStatement();
			stmt.executeUpdate("UPDATE bares SET nome='"
                    + bar.getNome() + "',endereco='"
                    + bar.getEndereco()+ "',contato='"
                    + bar.getContato() +"',obsBar='"
                    + bar.getObsBar()+"' WHERE nome='" + bar.getNome() + "'");
			return true;
		}catch(SQLException e){
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean remover(String nome){
		try {            
			stmt = (Statement) Conexao.con.createStatement();
            stmt.executeUpdate("DELETE FROM bares WHERE nome='"+ nome +"'");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
		return false;
	}
}
