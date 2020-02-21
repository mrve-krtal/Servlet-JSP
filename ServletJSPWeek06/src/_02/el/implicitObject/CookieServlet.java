package _02.el.implicitObject;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookieServletObject")
public class CookieServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		Cookie cookie1 = new Cookie("cookieName", "value cookie");
		resp.addCookie(cookie1);
		
		RequestDispatcher dispactcher = req.getRequestDispatcher("02.el.implicit/cookie.jsp");
		dispactcher.forward(req, resp);;
		
	}
}
