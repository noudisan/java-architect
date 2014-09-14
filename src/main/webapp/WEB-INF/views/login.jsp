<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>登录</title>
    <link href="css/login.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<h1>Please Log In to Your Account</h1>
<p>
    Please use the form below to log in to your account.
</p>
<form action="j_spring_security_check" method="post">
    <label for="j_username">Login</label>:
    <input id="j_username" name="j_username" size="20" maxlength="50"
           type="text"/>
    <br />
    <label for="j_password">Password</label>:
    <input id="j_password" name="j_password" size="20" maxlength="50"
           type="password"/>
    <br />
    <input type="submit" value="Login"/>
</form>
</body>
</html>