package br.com.magna.gerenciador.acao;

import java.io.IOException;
//import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.magna.gerenciador.models.Banco;
import br.com.magna.gerenciador.models.Empresa;

public class NovaEmpresa implements Acao {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//PrintWriter resp = response.getWriter();
		Empresa empresa = new Empresa();
		Banco banco = new Banco();
		empresa.setNome(request.getParameter("nome").toString());
		empresa.setCnpj(request.getParameter("cnpj").toString());
		banco.adiciona(empresa);
		
		
		//response.sendRedirect("entrada?acao=ListaEmpresa");
		return "redirect:entrada?acao=ListaEmpresas";
		
		//chamar o JSP usando request dispatcher
//		request.setAttribute("empresa", empresa.getNome());
//		RequestDispatcher rd = request.getRequestDispatcher("/listaempresasservlet");
//		rd.forward(request, response);
	}
	

}
