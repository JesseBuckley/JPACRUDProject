<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Error</title>
</head>
<body>
    <h2>Result of Health Care action:</h2>
    <c:if test="${errorMessage == true}">
        <p>Record action was successful</p>
    </c:if>
    <c:if test="${errorMessage == false}">
        <p>Record action was not successful</p>
    </c:if>
    <br>
    	<a href="home.do">Return to Home Page</a>
    
</body>
</html>