package _05.download;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/downloadServlet")
public class DownloadServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		resp.setContentType("application/ms-excell");
		resp.setHeader("Content-Disposition", "attachment; filename=downloadMe.xlsx");
		
		//projemideki static kaynaklara eriþim //context objemiz vasýtasý ile projemizdeki static kaynaklara eriþim saðlayabiliyoruz.
		ServletContext context=getServletContext();
		
		InputStream is=context.getResourceAsStream("test.xlsx"); //kaynaða eriþim saðlandý.
		
		//þimdi karakter bazlý okuma iþlemi yapalým.
		int read=0;
		byte[] bytes=new byte[1024];
		ServletOutputStream sos=resp.getOutputStream();
		
		while((read=is.read(bytes))!=-1) {
			sos.write(bytes,0,read);
		}
		sos.close();
		
				//excell için download
				//https://poi.apache.org/
				//http://jexcelapi.sourceforge.net/
				
				//pdf için download
				//http://community.jaspersoft.com/project/ireport-designer
				//http://community.jaspersoft.com/project/jasperreports-library
				
				//crystal reports paralý..
		
	}

}
