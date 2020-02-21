package _03.servletconfig;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfigXMLServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		ServletConfig config=getServletConfig();
		
		String name=config.getInitParameter("username");
		String password=config.getInitParameter("password");
		String servletName=config.getServletName();
		
		System.out.println("name: "+name);
		System.out.println("password: "+password);
		System.out.println("servlet name: "+servletName);
		
		System.out.println("parametre name..");
		Enumeration<String> params=config.getInitParameterNames();
		while(params.hasMoreElements()) {
			System.out.println(params.nextElement());
		}
	}
}
