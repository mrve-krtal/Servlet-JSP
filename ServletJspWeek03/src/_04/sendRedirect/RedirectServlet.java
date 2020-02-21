package _04.sendRedirect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/redirectServlet")
public class RedirectServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);

//		PrintWriter pw=resp.getWriter();
//		pw.print("java.lang.IllegalStateException");
//		pw.close();
		//response close edildikten sonra redirect yapýlmaz!!!
		
		//istediðimiz sayfaya yönlendirme yapmak için
		resp.sendRedirect("http://www.injavawetrust.com/"); 
		
		
	}

}
