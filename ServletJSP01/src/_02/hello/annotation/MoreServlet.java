package _02.hello.annotation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/url1","/url2","/url3"})
public class MoreServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Delete
		//super.doGet(req, resp);
		
		
	PrintWriter pw=resp.getWriter();
	pw.print("hello annotation more servlet  !!");
	
	}  
}
