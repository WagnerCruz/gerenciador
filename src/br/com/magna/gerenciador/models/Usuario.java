package br.com.magna.gerenciador.models;

public class Usuario {
	
	private String usuario;
	private String senha;
	
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	//verfica se usuario e senha estão corretos
	public boolean validaUser(String user, String pwd) {
		
		if(!this.usuario.equals(user)) {
			return false;
		}
		if(!this.senha.equals(pwd)) {
			return false;
		}		
		return true;
	}


}
