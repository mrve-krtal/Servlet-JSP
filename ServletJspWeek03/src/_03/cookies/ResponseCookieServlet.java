package _03.cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/responseCookieServlet")
public class ResponseCookieServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		Cookie username=new Cookie("username", "admin");
		
		//username.setMaxAge(8);  	//8 saniye time out süresi //usernameden 8 sn sonra sadece password yazacak.
		Cookie password=new Cookie("password", "123456");
		
		resp.addCookie(username);
		resp.addCookie(password);
		
		//private int maxAge = -1; 
		// Default deðeri, -1 Max-Age=VALUE ... cookies auto-expire
		
	}

}

//cookiler-> cerez
//HTTP cookie , browser cookie

//kullanicinin/end user , browserinda saklanan kucuk bilgilerdir.
//sayfa yuklendiginde ilgili cookiler server a gonderilir.
//sayanin yuklenmesi bu sayade daha hizli olacaktir.
//yani daha once gezindigimiz bir sayfada daha hizli dolasiriz , cookiler
//sayesinde.
//bir baska kullanim amaci olarak ; session yonetimi icin cookiler kullanilir.
//cookileri kapatirsaniz bazi sitelere giris yapamazsiniz, izin vermez,
//cookileri aktif edin seklinde uyari verecektir.
