<%@ page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
<head>
<title>Cookie</title>
</head>
<body>
	<%
	
		Cookie[] cookies = request.getCookies();
		for (int i = 0; i< cookies.length; i++){
			if(cookies[i].getName().equals("userID")){
				String id = cookies[i].getValue();
				if(id==null){
					response.sendRedirect("cookie_out.jsp");
					
				}else{
					out.println(id+"님 반갑습니다.");
				}
				
				
			}
		}
		
		
	%>
	<p><a href="cookie_out.jsp">로그아웃</a></p>
</body>
</html>