package model;

public class Bar {
	private String nome;
	private String endereco;
	private String contato;
	private String obsBar;
	
	public Bar(String nome, String endereco, String contato, String obsBar) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.contato = contato;
		this.obsBar = obsBar;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getObsBar() {
		return obsBar;
	}

	public void setObservacao(String obsBar) {
		this.obsBar = obsBar;
	}
	
	
	
}
