<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8" />

<title>Insert title here</title>

</head>

<body>

<h1> DOG </h1>
<form action="dogController" method="post">
	<table>
		<tr>
			<td>Name</td><td><input type="text" placeholder="name of your dog" name="name" id="name"/></td>
		</tr>
		<tr>
			<td>Breed</td><td><input type="text" placeholder="Breed" name="breed" id="breed"/></td>
		</tr>
		<tr>
			<td>Weight</td><td><input type="number" placeholder="lbs" name="weight" id="weight"/></td>
		</tr>
		<tr>
			<td><button type="submit"> Submit </button>
		</tr>
	</table>
</form>

<br></br>

<h1> Cat </h1>

<form action="catController" method="post">
	<table>
		<tr>
			<td>Name</td><td><input type="text" placeholder="name of your cat" name="name" id="name"/></td>
		</tr>
		<tr>
			<td>Breed</td><td><input type="text" placeholder="Breed" name="breed" id="breed"/></td>
		</tr>
		<tr>
			<td>Weight</td><td><input type="number" placeholder="lbs" name="weight" id="weight"/></td>
		</tr>
		<tr>
			<td><button type="submit"> Submit </button>
		</tr>
	</table>
</form>

</body>

</html>