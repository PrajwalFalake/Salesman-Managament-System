<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Add Task to Salesman</h2>
    <form action="/saveTask">
    Enter Salesman Id : <input type="number" name="SId"/><br>
    Enter Task : <input type="text" name="tsk"/><br>
   	<input type="submit"/>
    </form>

</body>
</html>