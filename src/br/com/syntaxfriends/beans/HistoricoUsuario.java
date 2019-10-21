package br.com.syntaxfriends.beans;

public class HistoricoUsuario {
  private int codigo_empresa;
  private int codigo_usuario_plataforma;
  public HistoricoUsuario(int codigo_empresa, int codigo_usuario_plataforma) {
		super();
		this.codigo_empresa = codigo_empresa;
		this.codigo_usuario_plataforma = codigo_usuario_plataforma;
  }
  public int getCodigo_empresa() {
		return codigo_empresa;
  }
  public void setCodigo_empresa(int codigo_empresa) {
		this.codigo_empresa = codigo_empresa;
  }
  public int getCodigo_usuario_plataforma() {
		return codigo_usuario_plataforma;
  }
  public void setCodigo_usuario_plataforma(int codigo_usuario_plataforma) {
		this.codigo_usuario_plataforma = codigo_usuario_plataforma;
  }
}
