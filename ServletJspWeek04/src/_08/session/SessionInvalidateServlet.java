package _08.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sessionInvalidate")
public class SessionInvalidateServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		HttpSession session=req.getSession();
		
		session.setAttribute("name", "value");
		session.invalidate();
		//session 2 þekilde invalidete edilebiliyor. Bu þekilde veya timeOut olunca
		//bundan sonra attribute (session) çaðýrýrsak IllegalStateException hatasý vercektir.
		
		session.setAttribute("name2", "value2");
	}

}
