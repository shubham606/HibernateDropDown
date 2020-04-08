package com.hibernatetask.model;

public class Book {
	private int bookId;
	private int studentId;
	private String bookName;
	private String bookDescription;
	private Student student;
	
	public Book()
	{
		
	}
	public Book(int bookId,int studentId,String bookName,String bookDescription,Student student)
	{
		this.bookId=bookId;
		this.studentId=studentId;
		this.bookName=bookName;
		this.bookDescription=bookDescription;
		//this.student=student;
	}
	
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookDescription() {
		return bookDescription;
	}
	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String toString()
	{
		return "book name is"+this.bookName +" student name is "+this.student.getStudentName();
	}
}