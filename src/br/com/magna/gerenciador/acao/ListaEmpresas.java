package br.com.magna.gerenciador.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.magna.gerenciador.models.Banco;
import br.com.magna.gerenciador.models.Empresa;

public class ListaEmpresas implements Acao {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		//PrintWriter output = response.getWriter();
		
		request.setAttribute("empresas", lista);	
		
//		RequestDispatcher rd = request.getRequestDispatcher("/listaempresas.jsp");
//		rd.forward(request, response);
		return "forward:/listaempresas.jsp";
	}
	

}
