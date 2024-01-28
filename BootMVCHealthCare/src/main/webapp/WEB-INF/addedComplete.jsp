<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib uri="jakarta.tags.core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Adding new Health Care Complete</title>
</head>
<body>

	<c:if test="${not empty healthCare}">
	<h2>Result of adding Health Care:</h2><br>
	<p>You have created a new Health Care record.</p>
	</c:if>
	
	<c:if test="${empty healthCare}">
	<h2>Result of adding Health Care:</h2><br>
	<p>You were not able to create a new Health Care record.</p>
	</c:if>
	
			<a href="home.do">Return to home page</a>
	
</body>
</html>