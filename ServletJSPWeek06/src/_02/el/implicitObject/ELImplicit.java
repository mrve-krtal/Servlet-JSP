package _02.el.implicitObject;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/elImplicit")
public class ELImplicit extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		req.setAttribute("myAttribute", "request scope attribute");
		req.getSession().setAttribute("myAttribute", "session scope attribute");
		getServletContext().setAttribute("myAttribute", "application scope attribute");
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("/02.el.implicit/attribute.jsp");
		dispatcher.forward(req, resp);
	}
}
