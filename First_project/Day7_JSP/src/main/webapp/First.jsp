<%@ page import="java.util.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!--  <h1> This is my first JSP Program</h1> --> 
<%

List <String> mylist=new ArrayList<String>();
mylist.add("hello");

mylist.add("Welcome");

out.println(mylist);
%>


</body>
</html>
