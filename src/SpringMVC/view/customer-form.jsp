<!-- Add reference for Spring form tag library -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head>
	<title>Customer Registration Form</title>
	
	<!-- defining cssClass for error. Can import your own css as well. -->
	<style type="text/css">
		.errorName {color:red}
	</style>
</head>

<body>
	
	<i>Fill out the form. Asterisk (*) means required.</i>
	<br><br>
	
	<form:form action = "processForm" modelAttribute = "customerReference">
	
		First Name: <form:input path="firstName"/>
		<br><br>
		 
		Last Name (*): <form:input path="lastName"/>
		<!-- adding field to display errors according to validation rules. See Customer class annotations for lastName -->
		<form:errors path = "lastName" cssClass="errorName" />
		<br><br>
		
		Free Passes: <form:input path = "freePasses"/>
		<form:errors path = "freePasses" cssClass = "errorName"/>
		<br><br>
		
		Postal Code: <form:input path = "postalCode"/>
		<form:errors path = "postalCode" cssClass = "errorName"/>
		<br><br>
		
		<input type = "submit" value =" Process Form">
	
	</form:form>
	
</body>

</html>





