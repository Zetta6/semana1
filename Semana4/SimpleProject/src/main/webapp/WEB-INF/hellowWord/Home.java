package hellowWord;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());

        // Sets the content type of the response

    	String userName = request.getParameter("name");
    	
        response.setContentType("text/html");

        // writes the response

        PrintWriter out = response.getWriter();
        
        if (userName != null) {
        out.write("<h1>Hola Mundo, desde " + userName + "</h1>");
        } else {
        	userName = "Unknow";
        	out.write("<h1>Hola Mundo, desde " + userName + "</h1>");
        }
        }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
