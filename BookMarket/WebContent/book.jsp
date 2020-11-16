<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import = "dto.Book" %>
<%@ page import ="dao.BookRepository" %>
<%@ page errorPage="exceptionNoBookId.jsp" %>
<jsp:useBean id = "BookDAO" class = "dao.BookRepository" scope = "session" />
<!DOCTYPE html>
<html>
<head>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="./resources/css/bootstrap.min.css">
<title>상품 상세 정보</title>
</head>
<body>
	<jsp:include page="menu.jsp"/>
	<div class = "jumbotron">
		<div class = "container">
			<h1 class = "display-3">도서 정보</h1>
		</div>
	</div>
	<%
		String id = request.getParameter("id");
		BookRepository dao = BookRepository.getInstance();
		Book book = dao.getBooktById(id);
	%>
	<div class = "container">
		<div class = "row">
			<div class="col-md-5">
				<img src="./resources/images/<%=book.getFilename() %>" style = "width:70%;">
			</div>
				<div class="col-md-6">
					<h3><%=book.getName() %></h3>
					<p><%=book.getDescription() %></p>
					<p><b>상품 코드 : </b><span class = "badge badge-danger"><%=book.getbookId() %></span>
					<p><b>출판사</b> : <%=book.getPublisher() %>
					<p><b>저자</b> : <%=book.getAuthor() %>
					<p><b>재고 수</b> : <%=book.getUnitInStock() %>
					<p><b>총 페이지 수</b> : <%=book.getTotalPages() %>
					<h4><%=book.getUnitPrice() %>원</h4>
					<p><a href ="#" class = "btn btn-info">상품 주문 &raquo;</a>
					   <a href="./books.jsp" class = "btn btn-secondary">상품 목록 &raquo;</a>	
				</div>
			</div>
			
	</div>
	<hr>
	<jsp:include page="footer.jsp" />
</body>
</html>