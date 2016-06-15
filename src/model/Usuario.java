package model;

public class Usuario {
	private String login;
	private String senha;
	private String persp;
	
	public Usuario(String login, String senha, String persp) {
		super();
		this.login = login;
		this.senha = senha;
		this.persp = persp;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getPersp() {
		return persp;
	}

	public void setPersp(String persp) {
		this.persp = persp;
	}	
}
