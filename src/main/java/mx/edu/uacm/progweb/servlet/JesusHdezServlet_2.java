package mx.edu.uacm.progweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JesusHdezServlet_2 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		/* 1)Si escribe un método init que tome un servletconfig como argumento,
		 * siempre llame a super.init() en la primera línea.
		 * 
		 * 2)ServletConfig cuenta con un método getIniParameter con el cual
		 * podemos buscar parametros de carga inicial asociados al servlet*/
		super.init(config);
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/* Cada vez que el servidor recibe una petición para un servlet emite
		 * un nuevo proceso y llama al método service*/
		super.service(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/**/
		String nombre = req.getParameter("nombre");
		String apellido = req.getParameter("apellido");
		System.out.println("\nConsola: Mi nombre es " + nombre + " y mi apellido es " + apellido );
		PrintWriter salida = resp.getWriter();
		/*Se utiliza salida para enviar el contenido al navegador web*/
		salida.println("Servlet: !Hola¡ mi nombre es " + nombre + " y mi apellido es " + apellido );
		
	}

}
