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
		
		resp.setCharacterEncoding("ISO-8859-9"); //Bu i�lemi PrintWriter i�leminden �nce yapmal�y�z.
		//E�er UTF-8 OLSAYDI. YAN� G�R�� UCU FARKLI 25. Sat�r da ��k�� ucu ISO-8859-1 oldu�u i�in porblem olacakt�r.
		
		PrintWriter pw=resp.getWriter();
		
		pw.print("<html>");
		pw.print("<head> <meta charset='ISO-8859'></head>"); 
		pw.print("<body>");
		pw.print("<p>i������i��i�</p>");
		pw.print("</body></html>");
		
		pw.print("i������");
		
		String responseEncoding=resp.getCharacterEncoding();
		
		System.out.println(responseEncoding);
		//Default olarak kullan�lan encoding ISO-8859-1 'D�R.
		
		//ENCOD�NG'� setCharacterEncoding ile de�i�tirelim.
		//ENCODING SET i�lemi getWriter'dan �nce olmal�d�r. yoksa bir anlam� olmayacakt�r.
		
	}

}

//bu problemler genel yaz�l�m problemidir. Javaya �zg� de�ildir.
//2. servlet i�in default encoding ISO-8859-1
//BU problemle yakla��rken 2 case akl�m�zda olacak;
//a-ilgili karakter seti destek sa�l�yor mu ?
//b-iki u� aras�nda ayn� encoding kullan�l�r. kullan�lm�yorsa problem ��kacakt�r.
