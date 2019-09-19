<!-- references jstl tag library -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>Customer Confirmation</title>
</head>

<body>

	The customer is confirmed: ${customerReference.firstName} ${customerReference.lastName}
	<br><br>
	
	Free Passes: ${customerReference.freePasses}
	<br><br>
	
	Postal Code: ${customerReference.postalCode}
	<br><br>
	
	<a href="/spring-mvc-demo/">Home Page</a>
	
</body>

</html>