package _07.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sessionTimeOutServlet")
public class SessionTimeOutServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		HttpSession session=req.getSession();
		session.setMaxInactiveInterval(10); //10 sn session vereceðiz. //attribute ekleyip attribute check edeceðiz.
		//session eriþimini 10 sn yapttýðýmýz için 10 sn'lik bir eriþim gerçekleþecek ve
		//10 sn'den sonra eriþim saðlanmayacak. NULL Deðer döndürecek.
		
		session.setAttribute("username", "merve");
		
		PrintWriter pw=resp.getWriter();
		String url="checkSessionTimeOut";
		
		pw.print("<a href=\" "+url+"\"> click me </a>");
	}

}
