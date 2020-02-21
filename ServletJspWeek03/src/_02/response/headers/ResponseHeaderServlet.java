package _02.response.headers;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/responseHeaderServlet")
public class ResponseHeaderServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		resp.setHeader("name", "oldname");
		resp.setHeader("name", "merve");
		//setHeader onceki deðeri override eder.
		
		resp.addHeader("name", "test name");
		//add header override etmez.  üzerine ekleme iþlemi yapar.
		
		boolean cantainsHeader=resp.containsHeader("name");
		
		String header=resp.getHeader("name");
		System.out.println(header);
		
		Collection<String> headers=resp.getHeaders("name");
		for (String hdr:headers) {
			System.out.println(hdr);
			
		}
		
	}

}
