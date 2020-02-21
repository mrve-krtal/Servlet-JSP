package _01.helloservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		//BUNU SÝLMEYÝ UNUTMA!!!
		//super.doGet(req, resp);
		
		PrintWriter pw=resp.getWriter();
		Date date=new Date();
		String msg="Hello Servlet world";
		
		pw.print("<html><body><h1>"+msg+"</h1>");
		pw.print("<p> today: "+date+"</p>");
		pw.print("</body></html>");
	
	}

}
