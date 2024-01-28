<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="jakarta.tags.core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">

<title>Health Care Details</title>
</head>
<body>
	    
	<h2>Health Care Details</h2>
	    
	<c:choose>
		<c:when test="${not empty healthCare}">
        <p>ID: ${healthCare.id}</p>
        <p>Patient name: ${healthCare.patientName}</p>
        <p>Records on file: ${healthCare.medicalRecords}</p>
        <p>Health care provider(s): ${healthCare.healthcareProviders}</p>
        <p>Appointments: ${healthCare.appointments}</p>
        <p>Patient prescriptions: ${healthCare.prescriptions}</p>
			
			<br>
			<a href="updateHealthCare.do?id=${healthCare.id}">Update Records</a>
			<br>
			<br>
			<a href="deleteHealthCare.do?id=${healthCare.id}">Delete this medical record</a>
			<br>
		</c:when>

		<c:otherwise>
			<p>No health care records located for this health care ID. Enter a valid ID.</p>
		</c:otherwise>
	</c:choose>
			<br>
			<br>
			<a href="home.do">Return to home page</a>


</body>
</html>