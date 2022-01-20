<%-- 
    Document   : arithmeticcalculator
    Created on : 18-Jan-2022, 6:52:24 PM
    Author     : lisaj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
        <form action="arithmetic" method="post">
            
            <label for="input1">First:</label>
            <input type="number" name="input1" id="input1">
            <br>
            <label for="input2">Second:</label>
            <input type="number" name="input2" id="input2">
            <br>
            <input type="submit" name="button" value="+">
            <input type="submit" name="button" value="-">
            <input type="submit" name="button" value="*">
            <input type="submit" name="button" value="%">
        
        </form>
        
        <p>$(message)</p>
        <br>
        <a href="/age">Age Calculator Page</a>
    </body>
</html>
