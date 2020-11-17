<%@ page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
<head>
<title>Session</title>
</head>
<body>
	<%
		String user_id = request.getParameter("id");
		String user_pw = request.getParameter("passwd");
		String id = "admin";
		String passwd = "admin";
		
		if(user_id.equals(id) && user_pw.equals(passwd)){
			session.setAttribute("UserId", user_id);
			response.sendRedirect("welcome.jsp");
				
		}else{
			
			response.sendRedirect("session.jsp");
		}
	%>
</body>
</html>