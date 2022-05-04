<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Prime List</title>
<style type="text/css">
body{
	text-align: center;
}
</style>
</head>
<body>
<h1>Prime List</h1>
<%
	ArrayList<Integer> primeList = (ArrayList<Integer>) request.getAttribute("primeList");
	for(int num : primeList){
		out.print(num+ ",");
	}
%>
</body>
</html>