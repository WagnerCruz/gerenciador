package br.com.magna.gerenciador.acao;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.magna.gerenciador.models.Banco;
import br.com.magna.gerenciador.models.Usuario;

public class AutenticaUsuario implements Acao{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Autentica Usuario - 1");
		String userid = request.getParameter("user");
		String pwd = request.getParameter("password");
		
		Banco banco = new Banco();
		Usuario usuario = banco.getUsuario(userid, pwd);
		
		System.out.println("Autenticando o usuario: " + userid + " - senha: " + pwd);
		
		if(usuario != null) {
			System.out.println("Usuario Logado");
			HttpSession sessao = request.getSession();
			sessao.setAttribute("usuarioLogado", usuario);
			return "redirect:entrada?acao=ListaEmpresas";
		}else {
			System.out.println("usuario nao autenticado!");
			return "redirect:entrada?acao=LoginPagina";
		}		
	}

}
