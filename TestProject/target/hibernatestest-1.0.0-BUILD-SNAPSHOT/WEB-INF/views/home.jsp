<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
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
    <a class="navbar-brand" href="#">Project</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="collapsibleNavbar">
      <ul class="navbar-nav ml-auto">
        <li class="nav-item"><a class="nav-link" href="login">Login</a></li>
        <li class="nav-item"><a class="nav-link" href="reg">Register</a></li>
      </ul>
    </div>
  </nav>
  <div class="container" style="margin-top: 30px">
    <div class="card-deck">
      <div class="card shadow p-4 mb-4 bg-white">        
        <div class="card-body text-center">
         <h4 class="card-title text-left  text-primary">Spring</h4>
          <ul class="list-group">
            <li class="list-group-item d-flex justify-content-between align-items-center text-primary">spring-context <span
              class="badge badge-primary badge-pill">5.1.0.RELEASE</span>
            </li>
            <li class="list-group-item d-flex justify-content-between align-items-center text-primary">spring-webmvc <span
              class="badge badge-primary badge-pill">5.1.0.RELEASE</span>
            </li>
            <li class="list-group-item d-flex justify-content-between align-items-center text-primary">spring-jdbc <span
              class="badge badge-primary badge-pill">5.1.0.RELEASE</span>
            </li>
            <li class="list-group-item d-flex justify-content-between align-items-center text-primary">spring-tx <span class="badge badge-primary badge-pill">5.1.0.RELEASE</span>
            </li>
          </ul>
        </div>
      </div>
      <div class="card shadow p-4 mb-4 bg-white">        
        <div class="card-body text-center">
        <h4 class="card-title text-left text-dark">Hibernate</h4>
          <ul class="list-group">
            <li class="list-group-item d-flex justify-content-between align-items-center text-dark">hibernate-core <span
              class="badge badge-dark badge-pill">5.3.6.Final</span>
            </li>
          </ul>
        </div>
      </div>
    </div>    
    <br>
    <div class="card-deck mt-3">
      <div class="card shadow p-4 mb-4 bg-white">        
        <div class="card-body text-center">
        <h4 class="card-title text-left text-success">Validation</h4>
          <ul class="list-group">
            <li class="list-group-item d-flex justify-content-between align-items-center text-success">validation-api <span
              class="badge badge-success badge-pill">2.0.1.Final</span>
            </li>
            <li class="list-group-item d-flex justify-content-between align-items-center text-success">hibernate-validator <span
              class="badge badge-success badge-pill">6.0.13.Final</span>
            </li>
          </ul>
        </div>
      </div>
      <div class="card shadow p-4 mb-4 bg-white">        
        <div class="card-body text-center">
        <h4 class="card-title text-left text-info">Database</h4>
          <ul class="list-group">
            <li class="list-group-item d-flex justify-content-between align-items-center text-info">mysql-connector-java <span
              class="badge badge-info badge-pill">8.0.12</span>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </div>
  <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script type="text/javascript" src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</body>
</html>
