<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="main.css" type="text/css"/>
</head>
<body>
<img src="images/murach.png" alt="Murach Logo" width="100">
<h1>Survey</h1>
<p>If you have a moment, we'd appreciate it if you would fill out this survey.</p>
<h1>Your information</h1>
<!--<p>To join our email list, enter your name and
    email address below.</p> -->
<form action="emailList" method="post">
    <input type="hidden" name="action" value="add">

    <label>First Name:</label>
    <input type="text" name="firstName" required><br>

    <label>Last Name:</label>
    <input type="text" name="lastName" required><br>

    <label>Email:</label>
    <input type="email" name="email" required><br>

    <label>Date of birth:</label>
    <input type="date" name="birth" required><br>

    <h1>How did you hear about us?</h1>

    <p><input type="radio" name="hear" value="Search engine"checked>Search engine
    <input type="radio" name="hear" value="Word of mouth">Word of mouth
    <input type="radio" name="hear" value="Both">Both
    <input type="radio" name="hear" value="Other">Other</p>

    <h1>Would you like to receive announcements about new CDs and special offers?</h1>

    <p><input type="checkbox" name="announcements" value="YES, I'd like that.">YES, I'd like that.<br>
    <input type="checkbox" name="announcements" value="YES, please send me email announcements.">YES, please send me email announcements.<br></p>

    <p>PLease contact me by:
        <select name="contact">
            <option value="Email">Email</option>
            <option value="Postal mail">Postal mail</option>
            <option value="Email or postal mail"selected>Email or postal mail</option>
        </select>
    </p>

    <input type="submit" value="Submit" id="submit">
</form>
</body>
</html>
