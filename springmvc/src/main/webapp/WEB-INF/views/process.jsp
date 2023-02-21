<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="alluser" method="post">
	<%String email=(String)request.getAttribute("email"); %>
your email is <%=email %>
<input type="submit" value="getalluser"/>
	
</form>
</body>
</html>