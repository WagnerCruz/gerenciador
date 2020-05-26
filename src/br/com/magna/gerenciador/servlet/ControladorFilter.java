package br.com.magna.gerenciador.servlet;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.magna.gerenciador.acao.Acao;

/**
 * Servlet Filter implementation class ControladorFilter
 */
//@WebFilter("/entrada")
public class ControladorFilter implements Filter {

	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		String parametro = request.getParameter("acao");
		String jspRetorno;
		String nomeClasse = "br.com.magna.gerenciador.acao." + parametro;
		System.out.println("Controlador");
		System.out.println(nomeClasse);
		
		try {
			Class classe = Class.forName(nomeClasse);
			Acao acao = (Acao) classe.newInstance();		
			jspRetorno = acao.executa(request, response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | ServletException
				| IOException e) {
			throw new ServletException(e);
		}
		
		String[] retorno = jspRetorno.split(":");
		
		if(retorno[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view"+retorno[1]);
			rd.forward(request, response);			
		}else {
			response.sendRedirect(retorno[1]);
		}
	}

}
