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
		
		String name=(String)context.getAttribute("testName"); //ContextAttributeServlet k�sm�ndaki testName ile ayn� isimde olmaz ise null de�er d�necektir.
		Integer age=(Integer)context.getAttribute("testAge"); //ContextAttributeServlet k�sm�ndaki testName ile ayn� isimde olmaz ise null de�er d�necektir.
		int[] numbers=(int[])context.getAttribute("numbersArray"); //ContextAttributeServlet k�sm�ndaki testName ile ayn� isimde olmaz ise null de�er d�necektir.
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(numbers);
		
		
	}
}
