package _05.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sessionAttributeServlet")
public class SessionAttributeServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		HttpSession session=req.getSession();
		session.setAttribute("username", "merve kartal");
	
		String url="GetSession";
		
		String encodeURLLink=resp.encodeUrl("GetSession"); //url ReWriting
		
		PrintWriter pw=resp.getWriter();
		
		pw.print("<a href=\" "+url+"\"> click me </a>");
		pw.print("</br>");
		pw.print("<a href=\" "+encodeURLLink+"\"> click me -URL rewriting </a>");
		//Cookie'ler kapal� iken uncodeUrl i�lemi yap�lmaz. A��k iken yap�l�r.
		//Cookie'leri kapatt���m�zda linke t�klayamay�z.
		
		
		
		
	}
}
