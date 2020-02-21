package _05.request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/handleRequestFormPost")
public class HandleRequestFormPost extends HttpServlet {

	//DIKKAT!! doPost metodunu override ettik.
	//bu ornegi direkt çalýþtýrýrsak hata alýrýz.
	//çünkü servleti buradan çalýþtýrmaya kalkarsak doGet metodunu cagýrmaktadýr.
	//buraya http post ile geldiðimizde doPost metodu çalýþýr.
	
	//Post ile gönderilen url'e konulmaz.. Arka tarafta formData alýnýna giriyor.
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
System.out.println("HandleRequestFormPost");
System.out.println("doPost metdou...");
		
		//getParameter metodu ile gelen request parametlerini okuruz.
		
		String firstName=req.getParameter("firstName");
		String lastName=req.getParameter("lastName");
		String gender=req.getParameter("gender");
		String status=req.getParameter("marital status");
		
		String[] langs=req.getParameterValues("lang");
		
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(gender);
		
		if(langs!=null) {
			for (String lang:langs) {
				System.out.println(lang);
			}
		}
	}
}
