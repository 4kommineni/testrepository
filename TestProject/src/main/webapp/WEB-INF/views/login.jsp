<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Spring Hibernate Test</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>
  <div class="jumbotron text-center" style="margin-bottom: 0">
    <h1>Spring Hibernate Test Project</h1>
    <p>Developed over Spring5, Tomcat 9, MySQL 8, Hibernate 5</p>
  </div>
  <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <a class="navbar-brand" href="home">Project</a>
  </nav>
  <div class="container" style="margin-top: 30px">
    <div class="card shadow p-4 mb-4 bg-white">
      <div class="card-body">
        <h4 class="card-title text-center  text-primary">Login</h4>
        <sf:form action="loginSubmit" method="post" modelAttribute="login">
          <label>${loginError}</label>
          <div class="form-group">
            <label for="email">Email:</label>
            <sf:input type="email" path="email" class="form-control" placeholder="Enter email" required="required"></sf:input>
            <sf:errors path="email" class="text-danger"></sf:errors>
          </div>
          <div class="form-group">
            <label for="password">Password:</label>
            <sf:input type="password" path="password" class="form-control" placeholder="Enter password" required="required"></sf:input>
            <sf:errors path="password" class="text-danger"></sf:errors>
          </div>          
          <button type="submit" class="btn btn-primary">Submit</button>
        </sf:form>
        <br/>
        <a href="#" class="card-link">Forgot Password?</a> 
        <br/>
        <a href="reg" class="card-link">New User! Register?</a>
      </div>      
    </div>
  </div>
  <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script type="text/javascript" src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</body>
</html>