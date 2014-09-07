package website.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import website.bean.AdminBean;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

public class AdminServlet extends HttpServlet{
	
	private static final long serialVersionUID = -8452284499415356603L;
	private RequestDispatcher adminJsp;
	private AdminBean adminBean = new AdminBean();
    
    public void init(ServletConfig config) throws ServletException {
            ServletContext context = config.getServletContext();
            adminJsp = context.getRequestDispatcher("/WEB-INF/jsp/admin.jsp");
    }
     
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
      UserService userService = UserServiceFactory.getUserService();
      User user = userService.getCurrentUser();

      if (user != null) {
			try {
				adminBean.setRightDivSource( AdminEnum.ADD_SONG.html );
				req.setAttribute("adminBean", adminBean);
				adminJsp.forward(req, resp);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
      } else {
          resp.sendRedirect(userService.createLoginURL(req.getRequestURI()));
      }
  }
    
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
	    UserService userService = UserServiceFactory.getUserService();
	    User user = userService.getCurrentUser();

	    if (user != null) {
    	
	    	AdminEnum adminEnum = AdminEnum.lookup.get( req.getParameter("actionType") );
	    	adminEnum.doOperation( req );
	    	adminBean.setRightDivSource( adminEnum.html );

	    	req.setAttribute("adminBean", adminBean);
	        try {
				adminJsp.forward(req, resp);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    } else {
	        resp.sendRedirect(userService.createLoginURL(req.getRequestURI()));
	    }
    
    }
}
