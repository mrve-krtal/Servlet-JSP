package _03.cookies;

import java.io.IOException;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getCookies")
public class GetCookiesServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		Cookie[] cookies=req.getCookies();
		if (cookies!=null) {
			for(Cookie cookie:cookies) {
				System.out.println(cookie.getName()+" "+cookie.getValue());
			}
		}
			
		else {
				System.out.println("no cookie");
			}
			
		}
		
	}

