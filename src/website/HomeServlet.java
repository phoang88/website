package website;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeServlet extends HttpServlet {
	
	private static final long serialVersionUID = 9068073047548986878L;
	private RequestDispatcher homeJsp;
    
    public void init(ServletConfig config) throws ServletException {
            ServletContext context = config.getServletContext();
            homeJsp = context.getRequestDispatcher("/homepage.jsp");
    }
     
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
    	       throws ServletException, IOException {
   
    	homeJsp.forward(req, resp);
    }
}
