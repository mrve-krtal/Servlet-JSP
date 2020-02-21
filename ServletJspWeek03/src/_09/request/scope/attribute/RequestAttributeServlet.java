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
		
		//dispatch etme yöntemi
		RequestDispatcher dispatcher=req.getRequestDispatcher("jspfiles/hello.jsp");
		dispatcher.forward(req, resp); //forward unutmuyoruz.
		
	
	}
}

//Biz bu dosyayý view'e yani jsp dosyasýna daðýtmýþ oluyoruz. 
//Bu isteði karþýlarken hem servlet hem de jsp kullanýlmýþ oluyor.
//Genel mantýkta spring MVC'imiz de bu þekildedir. 
//Orada bizim control'umuz isteði karþýlýyor. Geriye view dönüyoruz. 
//Objemizi ekliyoruz dolayýsýyla istek geldiðinde bizim control tetikleniyor bizim jsp'miz tetikleniyor ama tek bir istek söz konusu.
//Biz oraya view'de gösterceðimiz datayý ekliyoruz.

