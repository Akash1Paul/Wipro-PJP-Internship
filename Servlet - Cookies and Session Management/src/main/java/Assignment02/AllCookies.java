package Assignment02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(description = "Show All Cookies", urlPatterns = { "/" })
public class AllCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		Cookie[] cookies = request.getCookies();
		
		if (cookies != null) {
			out.println("<h1>List of cookies</h1>");
			out.println("<table border='1'>");
			for (int i = 0; i < cookies.length; i++) {
				out.println("<tr>");
				out.println("<td>" + cookies[i].getName() + "</td>");
				out.println("<td>" + cookies[i].getValue() + "</td>");
				out.println("</tr>");
			}
			out.println("</table>");
		} else {
			out.println("No Cookies");
		}
		
		out.close();
	}
}
