package _05.request;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/moreRequestMethod")
public class MoreRequestMethod extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		String hostHeader=req.getHeader("host");
		String serverName=req.getServerName();
		String contextpath=req.getContextPath();
		
		System.out.println("host:"+hostHeader);
		System.out.println("Server name:"+serverName);
		System.out.println("context path:"+contextpath);
		
		Enumeration<String> headerNames=req.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String headerName = headerNames.nextElement();
			String headerValue=req.getHeader(headerName);
			
			System.out.println("header name: "+headerName+"header value:"+headerValue);
			
		}
		
		int localPort=req.getLocalPort(); // tamamlandýðý port 
		int serverPort=req.getServerPort(); // server post isteðin ilk karþýlandýðý port
		int remotePort=req.getRemotePort(); //client 

		System.out.println(req.getRemoteAddr());
		System.out.println(req.getLocale());
		
		System.out.println(localPort);
		System.out.println(serverPort);
		System.out.println(remotePort);
		
	}
}
