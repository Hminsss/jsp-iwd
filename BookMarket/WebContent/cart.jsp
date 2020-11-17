<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="dto.Book" %>
<%@ page import="dao.BookRepository" %>
<html>
<head>
<link rel="stylesheet" href="./resources/css/bootstrap.min.css"/>
<%
	String cartId = session.getId();
%>
<title>장바구니</title>
</head>
<body>
	<jsp:include page="menu.jsp"/>
	<div class="jumbotron">
		<div class="container">
		<h1 class="display-3">장바구니</h1>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<table width = "100%">
			<tr>
				<td align="left"><a href="./deleteCart.jsp?cartId=<%=cartId %>" class="btn btn-danger">삭제하기</a></td>
				<td align="right"><a href="#" class ="btn btn-success">주문하기</a></td>
			</tr>
			</table>
		</div>
	</div>
	<div style="padding-top:50px">
		<table class="table table=hover">
			<tr>
				<th>상품</th>
				<th>가격</th>
				<th>수량</th>
				<th>소계</th>
				<th>비고</th>
			</tr>
			<%
				int sum = 0;
				ArrayList<Book> cartList = (ArrayList<Book>)session.getAttribute("cartlist");
				if( cartList == null){
					cartList = new ArrayList<Book>();
				}
				
				for(int i =0; i <cartList.size();i++){
					Book book = cartList.get(i);
					int total = book.getUnitPrice() * book.getQuantity();
					sum = sum + total;
				}
			%>
			<tr>
				<td><%=book.getbookId() %> - <%= book.getPname() %>
			</tr>
		</table>
	</div>
	
</body>
</html>