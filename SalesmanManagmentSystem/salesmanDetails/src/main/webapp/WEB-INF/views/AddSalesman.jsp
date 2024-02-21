<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!--  --<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Salesman Form</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container">
  <h2>Add Salesman Details</h2>
  <form action="salesmanData">
    <div class="form-group">
      <label for="name">Name</label>
      <input type="text" class="form-control" id="name" placeholder="Enter Name" name="name">
    </div>
    <div class="form-group">
      <label for="addr">Address</label>
      <input type="text" class="form-control" id="addr" placeholder="Enter Address" name="address">
    </div>
    
    <div class="form-group">
      <label for="mob">Mobile Number</label>
      <input type="tel" class="form-control" id="mob" placeholder="Enter Mobile Number" name="mno">
    </div>

    <div class="form-group">
      <label for="reg">Region</label>
      <input type="text" class="form-control" id="reg" placeholder="Enter Region" name="region">
    </div>
    <div class="form-group">
      <label for="reg">Password</label>
      <input type="text" class="form-control" id="reg" placeholder="Enter password" name="pswd">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</div>

</body>
</html>-->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Salesman Form</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
  <style>
    .first{ background-color: rgb(242, 237, 245);padding:60px;border-radius: 20px;border:none;box-shadow: 2px 2px 3px rgb(255, 255, 255);}
    body{
  position: relative;
  z-index: 1;
  
  background-image: 
/*     radial-gradient(ellipse at center, #2883b6 0%, #084688 100%), */
    radial-gradient(ellipse at bottom left, rgba(104,128,138,0.4) 10%, rgba(138,114,76,0) 40%),
    linear-gradient(to bottom, rgba(57,173,219,.25), rgba(42,60,87,0.4)),
    linear-gradient(135deg, #670d10, #092756);
}
html,body{
  padding:0;
  margin:0;
  width:100%;
  height: 100%;
}

  </style>
</head>
<body>
<div class="container first my-5">
  <h2>Add Salesman Details</h2>
  <form action="salesmanData">
    <div class="form-group">
      <label for="name">Name</label>
      <input type="text" class="form-control" id="name" placeholder="Enter Name" name="name">
    </div>
    <div class="form-group">
      <label for="mob">Mobile Number</label>
      <input type="tel" class="form-control" id="mob" placeholder="Enter Mobile Number" name="mob">
    </div>
  
    <div class="form-group">
      <label for="addr">Address</label>
      <input type="text" class="form-control" id="addr" placeholder="Enter Address" name="addr">
    </div>
    
    <div class="form-group">
      <label for="reg">Region</label>
      <input type="text" class="form-control" id="reg" placeholder="Enter Region" name="region">
    </div>

    <div class="form-group">
        <label for="task">Asign Task</label>
        <input type="text" class="form-control" id="task" placeholder="Enter task" name="task">
      </div>
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</div>
<% if (request.getAttribute("msg") != null) { %>
        <p style="color: red;"><%= request.getAttribute("msg") %></p>
    <% } %>

</body>
</html>