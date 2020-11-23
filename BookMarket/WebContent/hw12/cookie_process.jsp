<%@ page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
<head>
<title>Cookie</title>
</head>
<body>
	<%
		String user_id = request.getParameter("id");
		String user_pw = request.getParameter("passwd");
		String id = "admin";
		String passwd = "admin";
		
		if(user_id.equals(id) && user_pw.equals(passwd)){
			Cookie cookie_id = new Cookie("userID",user_id);
			Cookie cookie_pw = new Cookie("userPW", user_pw);
			response.addCookie(cookie_id);
			response.sendRedirect("welcomes.jsp");
				
		}else{
			
			response.sendRedirect("cookie.jsp");
		}
	%>
</body>
</html>