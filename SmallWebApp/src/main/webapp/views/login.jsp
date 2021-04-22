<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
        <img id="logo">
        <title>Login</title>
		<meta http-equiv="Content-Type" content="text/html; charsequence=8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<link href="/style/signup.css" rel="stylesheet" type="text/css"/>
		<link href="https://fonts.googleapis.com/css?family-Play" rel="stylesheet">
		<script type="text/javascript" src="/scripts/logValid.js"></script>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
    <div class="signup">
        <form id="form_id" action="loginNow" method="post">
        <div class="form-group">
            <h2 style="color: black">Login</h2><br>
            <input type="E-mail" name="UEmail" placeholder="Email" id="UEmail"><br><br>
            <input type="password" name="Password" placeholder="Password" id="Password"><br><br>
            <p id="pa1">enter all fields</p>
            <button type="button" onclick="myFunction()">Login</button><br><br>
            <br>
            <div id="container">
                    <a href="re.html"  style="margin-right:0px;  font-size:13px; font-family:Tahoma, Geneva, sans-serif;">Reset password</a>
                    <a href="for.html" style="margin-right:0px;  font-size:13px; font_family:Tahoma, Geneva, sans-serif;">Forgot password</a>                
            </div><br><br>
            Don't have account?<a href="register" style="">&nbsp;Sign up</a>
        </div>
        </form>
    </div>   
</body>
</html>
