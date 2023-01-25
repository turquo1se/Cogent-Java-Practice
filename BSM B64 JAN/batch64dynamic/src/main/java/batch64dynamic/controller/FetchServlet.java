package batch64dynamic.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import batch64dynamic.model.Employee;
import batch64dynamic.service.EmployeeService;
import batch64dynamic.service.EmployeeServiceImpl;
/**
 * Servlet implementation class FetchServlet
 */
@WebServlet("/FetchServlet")
public class FetchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FetchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * String statement = request.getParameter("estatement");
		 * 
		 * 
		 * EmployeeService eService = new EmployeeServiceImpl(); StringBuilder sb =
		 * null; sb = eService.read(statement);
		 * 
		 * PrintWriter out = response.getWriter(); out.print(sb.toString());
		 */
		
		EmployeeService eService = new EmployeeServiceImpl();
		
		
		List<Employee> li =  eService.fetchAll();
		
		PrintWriter out = response.getWriter();
		request.setAttribute("result", li);
		/*
		 * for(Employee e:li) { out.print("ID: "+ e.getId() + " Name: " + e.getName() +
		 * " Salary: " +e.getSalary() + " Address: " +e.getAddress() +" Mobile: " +
		 * e.getMobile() + "\n"); }
		 */
		
		RequestDispatcher rd =request.getRequestDispatcher("Fetch.jsp");
		rd.forward(request, response);
		
		
		
		
	}


}
