package br.com.syntaxfriends.beans;

public class UsuarioPlataforma {
	private int codigo;
	private int chave_api;
	public UsuarioPlataforma(int codigo, int chave_api) {
		super();
		this.codigo = codigo;
		this.chave_api = chave_api;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getChave_api() {
		return chave_api;
	}
	public void setChave_api(int chave_api) {
		this.chave_api = chave_api;
	}
}
