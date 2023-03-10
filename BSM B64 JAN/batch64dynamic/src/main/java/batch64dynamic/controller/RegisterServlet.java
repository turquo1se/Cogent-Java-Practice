package batch64dynamic.controller;

import java.io.IOException;
import java.io.PrintWriter;

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
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("ename");
		Float salary = Float.parseFloat(request.getParameter("esalary"));
		String address = request.getParameter("eaddress");
		String mobile = request.getParameter("emobile");
		
		Employee e = new Employee();
		e.setId(id);
		e.setName(name);
		e.setSalary(salary);
		e.setAddress(address);
		e.setMobile(mobile);
		
		EmployeeService eService = new EmployeeServiceImpl();
		eService.save(e);
		RequestDispatcher rd = request.getRequestDispatcher("/FetchServlet");
		rd.forward(request, response);
		
		PrintWriter out = response.getWriter();
		out.print(id+", "+name+", "+salary+", "+address+", "+mobile);
	}

}
