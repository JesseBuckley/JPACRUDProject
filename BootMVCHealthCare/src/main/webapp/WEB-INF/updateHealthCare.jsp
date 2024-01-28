<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="jakarta.tags.core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Edit Health Care Record</h2>

	<form action="/update" method="POST">
		
		<input type="hidden" name="id" value="${healthCare.id}"> 
		
		<label for="patientName">Patient name: </label> 
		<input type="text" name="patientName" value="${healthCare.patientName}" required> 
		<br>
		 
		<label for="medicalRecords">Medical record: </label> 
		<input type="text"name="medicalRecords" value="${healthCare.medicalRecords}" required> 
		<br>
		
		<label for="healthcareProviders">Health care provider(s): </label> 
		<input type="text"name="healthcareProviders" value="${healthCare.healthcareProviders}" required> 
		<br>
		
		<label for="appointments">Appointments: </label> 
		<input type="datetime-local"name="appointments" value="${healthCare.appointments}" required> 
		<br>
		
		<label for="prescriptions">Prescriptions: </label> 
		<input type="text"name="prescriptions" value="${healthCare.prescriptions}" required> 
		<br>
		
		<input type="submit" value="Update Medical Records">
	</form>
			<br>
		<a href="home.do">Return to home page</a>
	
</body>
</html>