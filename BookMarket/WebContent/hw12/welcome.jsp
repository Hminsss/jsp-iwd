<%@ page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
<head>
<title>Session</title>
</head>
<body>
	<%
		String id = (String)session.getAttribute("UserId");
		if(id == null){
		response.sendRedirect("session_out.jsp");
		}
	%>
	
	<h4><%=id %>님 반갑습니다.</h4>
	<br>
	<p><a href="session_out.jsp">로그아웃</a></p>
</body>
</html>