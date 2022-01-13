<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8" />

<title>Click Me!</title>

</head>

<body>

<center>

<form action="buttonController" method="post">

<button type="submit" name="submit" value="${numero}"> Click Me! </button>

</form>

<p>
	you have clicked thi button 
<c:out value="${numero}"/>
 times
</p>
    
</center>

</body>

</html>