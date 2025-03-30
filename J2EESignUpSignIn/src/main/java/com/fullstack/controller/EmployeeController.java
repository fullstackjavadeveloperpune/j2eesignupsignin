package com.fullstack.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fullstack.model.Employee;
import com.fullstack.service.EmployeeService;
import com.fullstack.service.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeController
 */
@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	EmployeeService employeeService = new EmployeeServiceImpl();

	String SIGNUP_PAGE = "/signup.jsp";
	String SIGNIN_PAGE = "/signin.jsp";
	String WELCOME_PAGE = "/welcome.jsp";

	/**
	 * Default constructor.
	 */
	public EmployeeController() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());

		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String redirect = "";

		String employeeId = request.getParameter("empid");

		String action = request.getParameter("action");

		if (action.equals("signup") && employeeId != null) {

			int empId = Integer.parseInt(employeeId);
			String empName = request.getParameter("empname");
			double empSalary = Double.valueOf(request.getParameter("empsalary"));
			String empEmailId = request.getParameter("empemailid");
			String empPassword = request.getParameter("emppassword");

			Employee employee = new Employee(empId, empName, empSalary, empEmailId, empPassword);

			employeeService.signUp(employee);

			redirect = SIGNIN_PAGE;

		} else if (action.equals("signin")) {

			String empEmailId = request.getParameter("empemailid");
			String empPassword = request.getParameter("emppassword");

			if (employeeService.signIn(empEmailId, empPassword)) {
				redirect = WELCOME_PAGE;
			} else {
				request.setAttribute("msg", "Oops, Invalid Credentials. Please try again!!!");
				redirect = SIGNIN_PAGE;
			}

		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(redirect);
		dispatcher.forward(request, response);
	}

}
