package _01.encoding;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/encodingType")
public class ResponseEncodingTypeServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		resp.setCharacterEncoding("ISO-8859-9"); //Bu iþlemi PrintWriter iþleminden önce yapmalýyýz.
		//Eðer UTF-8 OLSAYDI. YANÝ GÝRÝÞ UCU FARKLI 25. Satýr da çýkýþ ucu ISO-8859-1 olduðu için porblem olacaktýr.
		
		PrintWriter pw=resp.getWriter();
		
		pw.print("<html>");
		pw.print("<head> <meta charset='ISO-8859'></head>"); 
		pw.print("<body>");
		pw.print("<p>iþçðüöþiðöiþ</p>");
		pw.print("</body></html>");
		
		pw.print("iÞÇÖÐÝÜ");
		
		String responseEncoding=resp.getCharacterEncoding();
		
		System.out.println(responseEncoding);
		//Default olarak kullanýlan encoding ISO-8859-1 'DÝR.
		
		//ENCODÝNG'Ý setCharacterEncoding ile deðiþtirelim.
		//ENCODING SET iþlemi getWriter'dan önce olmalýdýr. yoksa bir anlamý olmayacaktýr.
		
	}

}

//bu problemler genel yazýlým problemidir. Javaya özgü deðildir.
//2. servlet için default encoding ISO-8859-1
//BU problemle yaklaþýrken 2 case aklýmýzda olacak;
//a-ilgili karakter seti destek saðlýyor mu ?
//b-iki uç arasýnda ayný encoding kullanýlýr. kullanýlmýyorsa problem çýkacaktýr.
