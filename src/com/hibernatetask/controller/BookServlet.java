package com.hibernatetask.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hibernatetask.dao.BookDao;
import com.hibernatetask.dao.impl.BookDaoImpl;
import com.hibernatetask.model.Book;

/**
 * Servlet implementation class CourseServlet
 */
@WebServlet("/view")
public class BookServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BookServlet() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("in servlet");
	}
	/**using my sql
	 * 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	BookDao bookDao;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try{
			bookDao=new BookDaoImpl();
//			detailsDao=new DetailsDaoImpl();
			List<Book> bookdetails=bookDao.getAllBooks();
			RequestDispatcher rd=request.getRequestDispatcher("bookdetails.jsp");
			request.setAttribute("bookdetails", bookdetails);
			System.out.println("in get of book");
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
		 //String b_Name = request.getParameter("b_name");
		 
		 try{
				bookDao=new BookDaoImpl();
				Book bookdetails=(Book) bookDao.getAllBooks();
				RequestDispatcher rd=request.getRequestDispatcher("bookdetails.jsp");
				request.setAttribute("book", bookdetails);
				List<Book> book1=bookDao.getAllBooks();
				request.setAttribute("bookdetails", book1);
				rd.include(request, response);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			
	}

	
}