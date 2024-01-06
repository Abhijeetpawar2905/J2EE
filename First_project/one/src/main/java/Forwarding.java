

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Forwarding
 */
public class Forwarding extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
		{
			ServletContext context=getServletContext();
ServletContext context1=context.getContext("/myapp");
RequestDispatcher rd=context1.getRequestDispatcher("/FirstServ"); 
			rd.forward(request,response);
		}
		catch(Exception ee)
		{
			System.out.println("in forwarding"+ee);
		}
	}

}
