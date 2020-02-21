package _01.expression.language.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import _01.expression.language.model.Department;
import _01.expression.language.model.Employee;

@WebServlet("/employee")
public class EmployeeServlet extends HttpServlet{
	
	Employee employee=prepareData();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		req.setAttribute("myEmployee", employee);
		
		req.setAttribute("myMap", prepareMap());
		
		req.setAttribute("myAtrribute", 10000);

		RequestDispatcher dispatcher = req.getRequestDispatcher("01.el/employee.jsp");
		dispatcher.forward(req, resp);
		
	}

	private Employee prepareData() {
		
		Department department=new Department(1,"IT Department");
		Employee employee=new Employee(100,"merve","kartal",5000,department);
		return employee;
		
	}
	
	private Map prepareMap() {
		Map <String,Integer> map=new HashMap<String,Integer>();
		map.put("key1", 1000);
		map.put("key2", 2000);
		map.put("key3", 3000);
		return map;
		
	}
}
