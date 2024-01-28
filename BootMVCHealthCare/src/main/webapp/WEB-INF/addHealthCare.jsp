<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Health Care Record</title>
</head>
<body>
<h2>Add Health Care Record</h2>

	<form action="addedComplete.do" method="POST">
				
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
		
		<input type="submit" value="Add Medical Record">
	</form>
			<br>
		<a href="home.do">Return to home page</a>
</body>
</html>