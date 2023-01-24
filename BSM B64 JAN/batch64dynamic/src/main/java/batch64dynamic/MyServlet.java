package batch64dynamic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// @WebServlet("/MyServlet") // annotation, if no or commented, webpage will show 404 error

// annotation based -- by default, xml based 


// container -- software which is responsible to manage life cycle of servlet

// life cycle -- to create object and call necessary method which will execute servlet

// life cycle methods: init(), service()/doPost()/doGet(), destroy()

// init() -- it is called once at the beginning in servlet life cycle

// service()/doPost()/doGet() -- it is called for every request

// destroy() -- it is called once at the end 

public class MyServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	public MyServlet() {
		super();
	}
	
	@Override
	public void init() throws ServletException{
		System.out.println("init ");
		super.init();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("Hello to my servlet"+ new Date());
	}
	
	@Override
	public void destroy() {
		System.out.println("Destroy ");
		super.destroy();
	}

}

// front end(.jsp), back end(servlet)
