package _05.request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/handleRequestForm")
public class HandleRequestFrom extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		System.out.println("HandleRequestForm");
		
		//getParameter metodu ile gelen request parametlerini okuruz.
		
		String firstName=req.getParameter("firstName");
		String lastName=req.getParameter("lastName");
		String gender=req.getParameter("gender");
		String status=req.getParameter("marital status");
		
		String[] langs=req.getParameterValues("lang");
		
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(gender);
		
		if(langs!=null) {
			for (String lang:langs) {
				System.out.println(lang);
			}
		}
		
		 
	}

}
