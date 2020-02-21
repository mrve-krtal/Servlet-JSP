package _07.context.scope.attribute;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/contextAttributeServlet")
public class ContextAttributeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		ServletContext context=getServletContext();
		
		//Context scope 'a objeleri býrakýyoruz.
		context.setAttribute("testName", "testNameValue");
		context.setAttribute("testAge", 20);
		
		int numbers[]= {1,2,3,4,5,6,7};
		
		context.setAttribute("numbersArray", numbers);
		
		//http://localhost:8080/ServletJspWeek03/contextAttributeServlet
		
	}
}
