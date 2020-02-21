package _04.servletContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ResourceServletContextUrl")
public class ResourceServletContext extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		ServletContext context=getServletContext();
		
		InputStream inputStream=context.getResourceAsStream("/WEB-INF/properties/myFileproperties");
		
		Properties props=new Properties();
		props.load(inputStream);
		
		String name=props.getProperty("name:");
		String surname=props.getProperty("surname:");
		
		System.out.println(name);
		System.out.println(surname);
		
		InputStream inputStream2=context.getResource("/WEB-INF/myFile.txt").openStream();
		
		int content;
		while((content=inputStream2.read())!=-1) {
			System.out.print((char)content);
		}
	}

}
