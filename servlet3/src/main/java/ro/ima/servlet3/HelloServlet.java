package ro.ima.servlet3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/hello")
//@WebServlet(urlPatterns = "/test")
public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 6122212893122343861L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/html/index.html").forward(request,
				response);
	}
}
