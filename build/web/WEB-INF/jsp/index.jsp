<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>    
        <form action="GetCapabilities" method="GET">  

            Request= <input type="text" name="REQUEST" >
            Version =<input type="text" name="AcceptVersions" > 
            OutputFormat = <input type="text" name="AcceptFormat" > 
            <input type="submit" >

        </form>
    </body>
</html>
