package _02.hello.annotation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/helloServletAnnotation")
public class HelloServletAnnotation extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Delete me!!
		//super.doGet(req, resp);
		
		PrintWriter pw=resp.getWriter();
		pw.print("hello servlet annotation !");
	}

}

//1-extends Httpservlet 
//2-@Webservlet
//3-doGet override et.

