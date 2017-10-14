package bmi.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bmi.models.CalculateModel;
import bmi.models.ResultModel;

@WebServlet("/BMIResult")
public class ResultController extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public ResultController(){
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		ResultModel person = new ResultModel();

		String Ht = request.getParameter("height");
		String Wt = request.getParameter("weight");

		String url = "/WEB-INF/bmi/views/ResultView.jsp";
		double Htdouble;
		try{
			Htdouble = Double.valueOf(Ht);
		} catch (NumberFormatException e) {
			Htdouble = 0;
			url = "/WEB-INF/bmi/views/BMIView.jsp";
		}
		double Wtdouble;
		try{
			Wtdouble = Double.valueOf(Wt);
		} catch (NumberFormatException e) {
			Wtdouble = 0;
			url = "/WEB-INF/bmi/views/BMIView.jsp";
		}

		person.setHeight(Htdouble);
		person.setWeight(Wtdouble);

		CalculateModel personCal = new CalculateModel();
		personCal.execute(person);


		request.setAttribute("personBmi",person);

		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);

	}

}
