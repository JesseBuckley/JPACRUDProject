<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="jakarta.tags.core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Health Care Home</title>
</head>
<body>

	<form action="healthCareDetails.do" method="GET">
		Health Care ID: <input type="text" name="id" /> <input type="submit"
			value="Show Health Care Details" />
	</form>

	<br>
	<h2>Add New Health Care Record:</h2>
	<a href="addHealthCare.do">Add Record</a>
	
	<div>
	<br>
	<c:forEach items="${healthCare}" var="healthCare">
		<a href="healthCareDetails.do?id=${healthCare.id}">Display details for: ${healthCare.patientName}</a>
		<br>
	</c:forEach>
	</div>
	
	
</body>
</html>