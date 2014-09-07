package website;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VideoServlet extends HttpServlet {

	private static final long serialVersionUID = -6709720664010281091L;
	private RequestDispatcher videoJsp;
    
    public void init(ServletConfig config) throws ServletException {
            ServletContext context = config.getServletContext();
            videoJsp = context.getRequestDispatcher("/WEB-INF/jsp/video.jsp");
    }
     
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
    	       throws ServletException, IOException {
   
    	videoJsp.forward(req, resp);
    }
}
