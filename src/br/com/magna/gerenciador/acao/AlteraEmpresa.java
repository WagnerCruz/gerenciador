package br.com.magna.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.magna.gerenciador.models.Banco;

public class AlteraEmpresa implements Acao  {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String empresaid = request.getParameter("id").toString();
		System.out.println("ID EMPRESA:" + empresaid);
		Integer id = Integer.valueOf(empresaid);
		Banco banco = new Banco();
		String nome = request.getParameter("nome").toString();
		String cnpj = request.getParameter("cnpj").toString();	
		
		System.out.println("altera empresa");
		
		banco.alteraempresa(id, nome, cnpj);
		//response.sendRedirect("entrada?acao=ListaEmpresa");
		return "redirect:entrada?acao=ListaEmpresas";
		
	}
	
	
	
}
