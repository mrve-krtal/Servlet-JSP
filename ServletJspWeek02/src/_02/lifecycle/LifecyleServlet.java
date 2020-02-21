package _02.lifecycle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lifecycle")
public class LifecyleServlet extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		//BUNU SÝL!!!
		//super.init();
		
		System.out.println("init....");
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		//BUNU SÝL!!
		//super.destroy();
		
		System.out.println("destroy..."); 	// destroy neden çalýþmadý.. 
											//service metodu tamamlanir. response ve request objeleri , GC (garbage
											//collector) tarafindan temizlenmeye uygun hale gelir.
											//thread sonlanir.
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//BUNU SÝLÝYORUZ..
		//super.doGet(req, resp);
		
		System.out.println("doGet...");
		System.out.println("temiz..");
	}

}
