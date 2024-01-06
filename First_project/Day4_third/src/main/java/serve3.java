

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class serve3
 */
public class serve3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
	}

	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try
		{
		PrintWriter pw=response.getWriter();
		pw.println("Overriding init(ServletConfig conf)");
		/* NullPointerException for following 2 statements*/
		pw.println("Config parameter value  "+getServletConfig().getInitParameter("user"));
		pw.println("Context parameter value   "+getServletContext().getInitParameter("database"));
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}

	
	

}
