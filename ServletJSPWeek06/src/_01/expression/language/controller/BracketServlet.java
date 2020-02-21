package _01.expression.language.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bracketServlet")
public class BracketServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		Map <String,Integer> map=new HashMap<String,Integer>();
		map.put("key1", 1000);
		map.put("key2", 2000);
		map.put("key3", 3000);

		
		String[] strArray= {"string1","string2","string3"};
		
		
		List<String> stringList=new ArrayList<String>();
		stringList.add("element1");
		stringList.add("element2");
		stringList.add("element3");
		stringList.add("element4");

		req.setAttribute("myMap", map);
		req.setAttribute("myArray", strArray);
		req.setAttribute("myList", stringList);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("01.el/bracket.jsp");
		dispatcher.forward(req, resp);
	}
}
