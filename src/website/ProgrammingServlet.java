package website;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProgrammingServlet extends HttpServlet{

	private static final long serialVersionUID = 5868343769413186487L;
	private RequestDispatcher programmingJsp;
    
    public void init(ServletConfig config) throws ServletException {
            ServletContext context = config.getServletContext();
            programmingJsp = context.getRequestDispatcher("/WEB-INF/jsp/programming.jsp");
    }
     
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
    	       throws ServletException, IOException {
   
    	programmingJsp.forward(req, resp);
    }
}
