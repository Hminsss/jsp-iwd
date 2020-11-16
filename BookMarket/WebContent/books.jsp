<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="dto.Book"%>
<%@ page import="dao.BookRepository" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="./resources/css/bootstrap.min.css">
<meta charset="EUC-KR">
<title>도서목록</title>
</head>
<body>
	<%@ include file="menu.jsp" %>
	<div class ="jumbotron">
		<div class ="container">
			<h1 class = "display-3">도서목록</h1>
		</div>
	</div>
	<% 
		BookRepository dao = BookRepository.getInstance();
		ArrayList<Book> listOfBooks = dao.getAllBooks(); 
	%>
	<div class="container">
		<div class="col" align="left">
			<%
				for (int i = 0; i < listOfBooks.size(); i++) {
					Book book = listOfBooks.get(i);
			%>
			<div class="" style="display: flex; alignitems: center;">
				<div class="" style = "margin-right: 30px;">
					<img src="./resources/images/<%=book.getFilename() %>" style="width: 150px;">
				</div>
				<div class="">
					<h3><b>[<%= book.getCategory() %>]<%= book.getName() %></b></h3>
					<br>
					<div style = "display : inline;">
						<p style = "display : inline;"><%= book.getDescription() %></p>
						<br>
					</div>
					<br>
					<p><%= book.getAuthor() %> | <%= book.getPublisher() %> | <%= book.getUnitPrice() %>원</p>
				
				</div>

				<div class="">
					<p style="margin-top:55%;"><a href="./book.jsp?id=<%=book.getbookId() %>" class="btn btn-secondary" role="button" style="width: 100px; margin-left:15px">상세정보&raquo;</a>
				</div>
			</div>
			<hr>
			<%
			
				}
			%>
		</div>
	</div>
	<%@ include file="footer.jsp"%>
</body>
</html>

