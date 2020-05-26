package br.com.magna.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.magna.gerenciador.models.Banco;
import br.com.magna.gerenciador.models.Empresa;

public class MostraEmpresa implements Acao {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		String empresaid = request.getParameter("id");
		Integer id = Integer.valueOf(empresaid);
		Banco banco = new Banco();
		
		//banco.removeEmpresa(id);
		Empresa empresa = banco.getEmpresa(id);
		
		request.setAttribute("empresa", empresa);
	//	RequestDispatcher rd = request.getRequestDispatcher("/MostraEmpresa.jsp");
	//	rd.forward(request, response);
		return "forward:/MostraEmpresa.jsp";
		}
	
	}
