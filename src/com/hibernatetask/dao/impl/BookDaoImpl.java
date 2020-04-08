package com.hibernatetask.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernatetask.dao.BookDao;
import com.hibernatetask.model.Book;
import com.hibernatetask.util.HibernateUtil;

public class BookDaoImpl implements BookDao {

	public List<Book> getAllBooks() {

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		List<Book> bookdetails =  session.createQuery("FROM Book b ,Student s where b.studentId=s.studentId").list();
		System.out.println(bookdetails);
		tx.commit();
		return bookdetails;
	}
//
//	@Override
//	public Details getBooksByName(String b_Name) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}