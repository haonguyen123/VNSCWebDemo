<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	org.apache.client.CSW_Service service = new org.apache.client.CSW_Service();
	org.apache.client.CSW port = service.getCSWPort();
	 // TODO initialize WS operation arguments here
	java.lang.String name = "";
	// TODO process result here
	java.lang.String result = port.describeRecord(name);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	org.apache.client.CSW_Service service = new org.apache.client.CSW_Service();
	org.apache.client.CSW port = service.getCSWPort();
	 // TODO initialize WS operation arguments here
	java.lang.String name = "";
	// TODO process result here
	java.lang.String result = port.getCapabilities(name);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

    <body>
        <p>Hello! This is the default welcome page for a Spring Web MVC project.</p>
        <p><i>To display a different welcome page for this project, modify</i>
            <tt>index.jsp</tt> <i>, or create your own welcome page then change
                the redirection in</i> <tt>redirect.jsp</tt> <i>to point to the new
                welcome page and also update the welcome-file setting in</i>
            <tt>web.xml</tt>.</p>
        <form action="NewServlet" method="GET">
First Name: <input type="text" name="first_name">
<br />
Last Name: <input type="text" name="last_name" />
<input type="submit" value="Submit" />
</form>
    </body>
</html>
