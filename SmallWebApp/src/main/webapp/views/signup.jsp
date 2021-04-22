<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<html>
<head>
<img id="logo">
<meta http-equiv="Content-Type" content="text/html; charsequence=8" />
<meta charset="utf-8">
 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Untitled Document</title>
<link href="/style/signup.css" rel="stylesheet" type="text/css"/>
<link href="https://fonts.googleapis.com/css?family-Play" rel="stylesheet">
<script type="text/javascript" src="/scripts/regValid.js"></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<img id="logo"/>
</head>
<body>
    <div class="signup">
        <form id="form_id" action="userDetail" method="post">
        <div class="form-group">
            <h2 style="color: #fff;">Register</h2>
            <input type="text" name="UName" placeholder="first name" id="UName"><br><br>
            <input type="text" name="EmailId" placeholder="Email address" id="EmailId"><br><br>
            <input type="text" name="Phone" placeholder="Phone No." id="Phone"><br><br>
            <input type="password" name="Password" placeholder="Password" id="Password"><br><br>
            <input type="password" name="CPassword" placeholder="Confirm Password" id="CPassword"><br><br>
            <p id="pa1">enter all fields</p>
            <button type="button" onclick="myFunction()">Sign up</button><br>
            
            Already have an account<a href="login" style="text-decoration: none; font-family: 'Play', sans-serif; color:yellow;">&nbsp;Log In</a>
       </div>
        </form>
    </div>
</body>
</html>