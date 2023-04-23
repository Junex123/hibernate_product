<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="register" method="post">
Name::<input type="text" name="uname"><br><br>
Price::<input type="text" name="uprice"><br><br>
Country::<select name="ucountry">
<option>INDIA</option>
<option>USA</option>
<option>UGANDA</option>
<option>CHINA</option>
<option>AFRICA</option>
<option>FRANCE</option>
<option>OTHERS</option>
</select><br><br>
About_it::<input type="text" name="uabout"><br><br>
<input type="submit" value="register">
</form>
</body>
</html>