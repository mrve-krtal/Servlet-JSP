package _03.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import _03.model.Person;

@WebServlet("/getPerson")
public class PersonController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		Person person=new Person();
		person.setName("test name");
		person.setSurname("test surname");
		person.setAge(20);
		
		req.setAttribute("personAttribute", person); //id deðerim
		
		RequestDispatcher view=req.getRequestDispatcher("03.view/personPage.jsp");
		view.forward(req, resp);
		
	}
	

}
