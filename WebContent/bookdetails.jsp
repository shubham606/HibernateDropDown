<%@ include file="header.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        <script>
            $(function () {
                $("#datepicker").datepicker();
            });
        </script>

</head>
<body>

<center><u><h1>Book Details</h1></u></center>



<div align="center">
		
			
			
		<form action="view" method="post">
Select a Book:&nbsp; <select name="bookName">
					<c:forEach items="${bookdetails}" var="book">
						<option value="${book.bookName}">
							${book.bookName}</option>
					</c:forEach>
					</select>
					
				Select Student: <select name="studentid">
					<c:forEach items="${bookdetails}" var="book">
						<option value="${book.student.studentId}">
							${book.student.studentName}</option>
					</c:forEach>
				</select>
				Issue Date
					<%-- <c:forEach items="${allStudents}" var="student">
						<option value="${book.student.studentId}">
							${book.student.studentName}</option>
					</c:forEach> --%>
					<input type="text" name="selDate" id="datepicker">
				<br>
				<br>
                     <input type="submit"></input>
				
				</form>
		
	</div>
</body>
</html>