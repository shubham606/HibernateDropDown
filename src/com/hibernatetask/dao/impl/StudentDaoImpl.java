package com.hibernatetask.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernatetask.dao.StudentDao;
import com.hibernatetask.model.Student;
import com.hibernatetask.util.HibernateUtil;

public class StudentDaoImpl implements StudentDao {

	public List<Student> getAllStudents() {
		
		
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			Transaction tx=session.beginTransaction();
			List<Student> studentdetails=session.createQuery("from Student").list();
			System.out.println(studentdetails);
			tx.commit();
			return studentdetails;
		}
//
//	@Override
//	public Student getStudentByName(Object s_name) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//	
}
