package model;

public class Bar {
	private String id;
	private String nome;
	private String endereco;
	private String contato;
	private String obsBar;
	
	
	public Bar(String id, String nome, String endereco, String contato,
			String obsBar) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.contato = contato;
		this.obsBar = obsBar;
	}

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

	public void setObsBar(String obsBar) {
		this.obsBar = obsBar;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
}
