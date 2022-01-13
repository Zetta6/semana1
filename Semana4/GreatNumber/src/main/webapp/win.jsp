<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8" />

<title>Great Number Game</title>

</head>

<body>

<center>

<h1>Welcome to Great Number Game!</h1>

<p>I am thinking of a number between 1 and 100</p>

<p>Take a guess!!</p>

<form action="ReturnController" method="post">

<button> Play again! </button>

</form>
    
<h1>CONGRATULATIONS!!</h1>
    
<h1><c:out value="${num}"/> era el número correcto =D</h1>
    
</center>

</body>

</html>