package bmi.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bmi.models.BMIModel;

/**
 * Servlet implementation class BMIController
 */
@WebServlet("/BMICal")
public class BMIController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public BMIController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BMIModel model = new BMIModel();

		this.getServletContext()
            .getRequestDispatcher("/WEB-INF/bmi/views/BMIView.jsp")
            .forward(request, response);
	}
}
