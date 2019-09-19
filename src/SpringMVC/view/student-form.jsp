<!-- Add reference for Spring form tag library -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

	<head>
		<title>Student Registration Form</title>
	</head>
	
	<body>
		
		<!-- Spring MVC Form Tag -->
		<form:form action="processForm" modelAttribute="modelStudentAttribute">
		
		<!-- path name must be same name as attributes from object, auto appends setters and getters -->
		<!-- will set to object by calling modelStudentAttribute.setFirstName("value being submitted") -->
		First Name: <form:input path="firstName"/>
		
		<br><br>
		
		Last Name: <form:input path="lastName"/>
		
		<br><br>
		
		Country: 
		
		<!-- method 1 for drop down form tag: hard coding values -->
		<form:select path="country">
		
			<form:option value="Brazil" label="Brazil"/>
			<form:option value="Spain" label="Spain"/>
			<form:option value="France" label="France"/>
			<form:option value="Germany" label="Germany"/>
			
		</form:select>
		
		<br><br>
		
		Country Version 2:
		
		<!-- method 2 for drop down form tag: reading values form java file -->
		<form:select path="country">
			
			<form:options items="${modelStudentAttribute.countryOptions}"/>
			
		</form:select>
		
		<br><br>
		
		Favorite Language:
		
		Java<form:radiobutton path="favoriteLanguage" value="Java" />
		C#<form:radiobutton path="favoriteLanguage" value="C#" />
		PHP<form:radiobutton path="favoriteLanguage" value="PHP" />
		Ruby<form:radiobutton path="favoriteLanguage" value="Ruby" /> 
		
		<br><br>
		
		Operating Systems:
		
		Linux<form:checkbox path="operatingSystems" value="Linux" />
		Mac OS<form:checkbox path="operatingSystems" value="Mac OS" />
		Windows 10<form:checkbox path="operatingSystems" value="Windows 10" />
		
		<br><br>
		<input type="submit" value="Press The Button">
		
		</form:form>
	
	</body>
</html>