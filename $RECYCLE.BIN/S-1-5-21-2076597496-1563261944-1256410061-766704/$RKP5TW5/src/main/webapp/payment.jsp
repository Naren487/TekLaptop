<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Payment Page</h1>
<form action=displaydetails method="get">
Bank account Number:<input type="text"/>
<input type="text" value="${fid}"/>
<input type="submit" value="submit"/>
</form>
</body>
</html>