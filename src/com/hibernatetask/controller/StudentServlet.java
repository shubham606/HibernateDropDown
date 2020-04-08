package com.hibernatetask.controller;

import java.io.IOException;
import java.util.List;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hibernatetask.dao.StudentDao;
import com.hibernatetask.dao.impl.StudentDaoImpl;
import com.hibernatetask.model.Student;

/**
 * Servlet implementation class CourseServlet
 */
@WebServlet("")
public class StudentServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StudentServlet() {
		// TODO Auto-generated constructor stub
		
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	StudentDao studentDao;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		studentDao=new StudentDaoImpl();
		try{
			
//			detailsDao=new DetailsDaoImpl();
			List<Student> studentdetails=studentDao.getAllStudents();
			RequestDispatcher rd=request.getRequestDispatcher("bookdetails.jsp");
			request.setAttribute("studentdetails", studentdetails);
		
			rd.forward(request, response);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
			
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 String studentName = request.getParameter("studentName");
		 
		 try{
				studentDao=new StudentDaoImpl();
				Student studentdetails=(Student) studentDao.getAllStudents();
				RequestDispatcher rd=request.getRequestDispatcher("bookdetails.jsp");
				request.setAttribute("student",studentdetails);
				List<Student> student1=studentDao.getAllStudents();
				request.setAttribute("studentdetails", student1);
				rd.include(request, response);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			
	}

	
}