package _07.context.scope.attribute;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getContextAttributeServlet")
public class GetContextAttributeServlet  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		ServletContext context=getServletContext();
		
		String name=(String)context.getAttribute("testName"); //ContextAttributeServlet kýsmýndaki testName ile ayný isimde olmaz ise null deðer dönecektir.
		Integer age=(Integer)context.getAttribute("testAge"); //ContextAttributeServlet kýsmýndaki testName ile ayný isimde olmaz ise null deðer dönecektir.
		int[] numbers=(int[])context.getAttribute("numbersArray"); //ContextAttributeServlet kýsmýndaki testName ile ayný isimde olmaz ise null deðer dönecektir.
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(numbers);
		
		
	}
}
