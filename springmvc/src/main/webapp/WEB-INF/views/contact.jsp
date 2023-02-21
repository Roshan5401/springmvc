<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact</title>
</head>
<body>
<h1>Registration form</h1>
	<form action="process" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" name="email" aria-describedby="emailHelp" placeholder="Enter email">
   </div>
   
  <div class="form-group">
    <label for="userName">User Name</label>
    <input type="text" class="form-control" name="username" id="userName" placeholder="Enter here">
  </div>
  

  <div class="form-group">
  <label for=userPassword>User Password</label>
  <input type="password" class="form-control" name="password" id="userPassword">
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>