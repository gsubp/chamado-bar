package dao;

import java.sql.SQLException;

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
}
