package br.com.syntaxfriends.beans;

public class Endereco {
	private int codigo;
	private String logradouro;
	private String cidade;
	private String bairro;
	private String numero;
	private String complemento;
	private String cep;
	public Endereco(int codigo, String logradouro, String cidade, String bairro, String numero, String complemento,
			String cep) {
		super();
		this.codigo = codigo;
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.bairro = bairro;
		this.numero = numero;
		this.complemento = complemento;
		this.cep = cep;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
}
