package _06.session;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sessionMethod")
public class SessionMethodServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		HttpSession session=req.getSession();
		String id=session.getId();
		Date creationTime=new Date(session.getCreationTime()); //session olusma tarihi (1970'den bu zaman kadar geçen)
		Date lastAccessTime=new Date(session.getLastAccessedTime()); //
		Integer maxInactiveTime=session.getMaxInactiveInterval();
		
		System.out.println("id: "+id);
		System.out.println("Session Oluþma zamaný: "+creationTime);
		System.out.println("Son eriþim tarihi:"+lastAccessTime);
		System.out.println("max ýnactive Time: "+maxInactiveTime);
		
		session.setMaxInactiveInterval(50); //negatif sayý verilirse sonsuz olarak ifade ediliyor.
		maxInactiveTime=session.getMaxInactiveInterval(); //2. defa çaðýralým.
		System.out.println("max inactive Time"+maxInactiveTime);
		
	}

}
