package _08.session.scope.attribute;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/GetsessionAttributeServlet")
public class GetSessionAttributeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		HttpSession session=req.getSession();
		
		String attribute=(String)session.getAttribute("sessionAttribute");
		System.out.println(attribute);
		
		//session attribute farklý bir broswer için çalýþtýðý için null deðer döndürür. 
		//fakat ayný browser da yeni bir pencerede çalýþtýrýrsak bize value deðeri döndürecektir.
		
	}
}

