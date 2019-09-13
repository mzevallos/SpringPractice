<!-- references jstl tag library - allows forEach functionality -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="givenPrefix" %>

<!DOCTYPE html>
<html>

	<head>
		<title>Student Confirmation Form</title>
	</head>
	
	<body>
		
		<!-- ${object.attributeName} will call upon the getter methods of the object to retrieve the information -->
		Student Confirmation Info: ${modelStudentAttribute.firstName} ${modelStudentAttribute.lastName}
		
		<br><br>
		Country: ${modelStudentAttribute.country}
		
		<br><br>
		Favorite Language: ${modelStudentAttribute.favoriteLanguage}
		
		<br><br>
		Operating Systems:
		<ul>
		
			<givenPrefix:forEach var="temp" items="${modelStudentAttribute.operatingSystems}">
			
			<li> ${temp} </li>
			
			</givenPrefix:forEach>
			
		</ul>
	</body>
</html>