<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Weather View</title>

<link rel="stylesheet" type="text/css" href="/css/formStyle.css">  
</head>
<body>


<form action="/weather/getWarmestDay">
<div>

<h1>Weather Info</h1>

<p>Enter following details</p>

<br>
Latitude : <input  type=text placeholder="latitude" name="latitude" Required/>
<br>

Longitude : <input  type=text placeholder="longitude" name="longitude" Required/>

<br>
<input type="submit" value="Submit" name="Submit"/>

</div>

<br>

</form>

</body>
</html>