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

<form action="NumberController" method="post">

<input type="number" placeholder="insert a number" name="number">

<button> Submit </button>

</form>
    
<h1><c:out value="${texto}"/></h1>
    
</center>

</body>

</html>