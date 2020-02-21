package _09.request.scope.attribute;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/requestAttributeServlet")
public class RequestAttributeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		req.setAttribute("requestAttribute", "requestAttributeValue");
		req.setAttribute("age", 24);
		
		//dispatch etme y�ntemi
		RequestDispatcher dispatcher=req.getRequestDispatcher("jspfiles/hello.jsp");
		dispatcher.forward(req, resp); //forward unutmuyoruz.
		
	
	}
}

//Biz bu dosyay� view'e yani jsp dosyas�na da��tm�� oluyoruz. 
//Bu iste�i kar��larken hem servlet hem de jsp kullan�lm�� oluyor.
//Genel mant�kta spring MVC'imiz de bu �ekildedir. 
//Orada bizim control'umuz iste�i kar��l�yor. Geriye view d�n�yoruz. 
//Objemizi ekliyoruz dolay�s�yla istek geldi�inde bizim control tetikleniyor bizim jsp'miz tetikleniyor ama tek bir istek s�z konusu.
//Biz oraya view'de g�sterce�imiz datay� ekliyoruz.

