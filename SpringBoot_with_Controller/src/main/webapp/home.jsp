<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br><br><br>
ALIEN CONTROLLER
<br><br><br>
<form action="addAlien">
UserId
<input type="text" name="aid">
<br>
UserName
<input type ="text" name="aname">
<br>
<input type="submit">
</form>


<form action="getAlien">
GetId
<input type="text" name="aid">
<br>
GetName
<input type ="text" name="aname">
<br>
<input type="submit" value="Retrieve">
</form>

</body>


</html>