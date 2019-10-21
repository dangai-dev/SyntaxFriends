package br.com.syntaxfriends.beans;

public class Empresa {
	private int codigo;
	private Endereco endereco;
	private String email;
	private String senha;
	private String nome_fantasia;
	private String telefone;
	private String website;
	public Empresa(int codigo, Endereco endereco, String email, String senha, String nome_fantasia, String telefone,
			String website) {
		super();
		this.codigo = codigo;
		this.endereco = endereco;
		this.email = email;
		this.senha = senha;
		this.nome_fantasia = nome_fantasia;
		this.telefone = telefone;
		this.website = website;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome_fantasia() {
		return nome_fantasia;
	}
	public void setNome_fantasia(String nome_fantasia) {
		this.nome_fantasia = nome_fantasia;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
}
