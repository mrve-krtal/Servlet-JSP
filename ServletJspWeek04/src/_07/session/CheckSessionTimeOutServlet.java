package _07.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/checkSessionTimeOut")
public class CheckSessionTimeOutServlet extends HttpServlet {
	
		 @Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			//super.doGet(req, resp);
			 
			 PrintWriter pw=resp.getWriter();
			 HttpSession session=req.getSession();
			 String username=(String)session.getAttribute("username");
			 pw.print(username);
		}
}
