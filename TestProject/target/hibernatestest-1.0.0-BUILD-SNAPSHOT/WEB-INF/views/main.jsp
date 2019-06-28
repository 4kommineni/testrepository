<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Spring Hibernate Test</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css">
</head>
<body>
  <div class="jumbotron text-center" style="margin-bottom: 0">
    <h1>Spring Hibernate Test Project</h1>
    <p>Developed over Spring5, Tomcat 9, MySQL 8, Hibernate 5</p>
  </div>
  <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <a class="navbar-brand" href="home">Project</a>
    <a class="navbar" href="logout">Logout</a>
  </nav>
  <div class="container" style="margin-top: 30px">
    <div class="card shadow p-4 mb-4 bg-white">
      <div class="card-body">
        <h4 class="card-title text-center  text-primary">View Details</h4>
        <table id="studentsTable" class="table table-striped table-bordered table-hover">
          <thead class="table-primary">
            <tr>
              <th>Adm No</th>
              <th>FName</th>
              <th>LName</th>
              <th>RNo</th>
              <th>ClsNo</th>
              <th>Maths</th>
              <th>Science</th>
              <th>Social</th>
              <th>Physics</th>
              <th>Total</th>
              <th>Avg</th>
            </tr>
          </thead>
          <tbody>
            <c:forEach var="s" items="${allStudents}">
              <tr>
                <td>${s.getAdmissionnumber()}</td>
                <td>${s.getFirstname()}</td>
                <td>${s.getLastname()}</td>
                <td>${s.getRollnumber()}</td>
                <td>${s.getClass_name()}</td>
                <td>${s.getMathmarks()}</td>
                <td>${s.getSciencemarks()}</td>
                <td>${s.getSocialmarks()}</td>
                <td>${s.getPhysicsmarks()}</td>
                <td>${s.getTotalmarks()}</td>
                <td>${s.getAveragemarks()}</td>
              </tr>
            </c:forEach>
          </tbody>
        </table>
      </div>
    </div>
  </div>
  <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script type="text/javascript" src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
  <script type="text/javascript" src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
  <script type="text/javascript" src="resources/js/main.js"></script>
</body>
</html>