package br.com.magna.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.magna.gerenciador.models.Banco;

public class RemoveEmpresa implements Acao {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String empresaid = request.getParameter("id");
		Integer id = Integer.valueOf(empresaid);
		Banco banco = new Banco();
		
		banco.removeEmpresa(id);
		//response.sendRedirect("entrada?acao=ListaEmpresa");
		
		return "redirect:entrada?acao=ListaEmpresas";
	}

}
