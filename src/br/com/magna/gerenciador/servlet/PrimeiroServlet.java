package br.com.magna.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.magna.gerenciador.models.Empresa;

@WebServlet("/primeiroservlet")
public class PrimeiroServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter output = resp.getWriter();
		Empresa empresa = new Empresa();
		empresa.setNome("nome");
		output.println("<html>");
		output.println("<body>");
		output.println("<h1>segue o seu retorno novamente "+empresa.getNome()+"</h1>");
		output.println("</body>");
		output.println("</html>");
		
		
	}


}
