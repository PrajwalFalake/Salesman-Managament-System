<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.expleo.salesmanDetails.entity.customers"
    import="java.util.List"
    %>
 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Wellcome to Salesman Dashboard</h1>
	<h3>Name : ${name}</h3>
	<h3>Region : ${region}</h3>-->
<%
List<customers> itr=(List<customers>)request.getAttribute("list");
for(customers cus : itr){%>
	<h2>Customers: </h2><%
	out.println("<br>"+cus.getName());

	out.println("<br>"+cus.getAddress());
}
	
%>
 
</body>
</html>