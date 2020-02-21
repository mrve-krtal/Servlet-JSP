package _03.servletconfig;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="ConfigXMLServletAnnotation", urlPatterns = {"/ConfigXMLServletAnnotationUrl"},

	initParams = { @WebInitParam(name="param1", value="value1"), 
			@WebInitParam(name="param2", value="value2") }
		
		)
public class ConfigXMLServletAnnotation extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		ServletConfig config=getServletConfig();
		
		String paramX=getInitParameter("param1"); //@WebInitParam'da ki (name="param1") ayný olmak zorunda yoksa null deðer dönmektedir.
		String paramY=getInitParameter("param2");
		String servletName=config.getServletName();
		
		System.out.println("param1:"+paramX);
		System.out.println("param2:"+paramY);
		System.out.println(servletName);
		
	}

}
