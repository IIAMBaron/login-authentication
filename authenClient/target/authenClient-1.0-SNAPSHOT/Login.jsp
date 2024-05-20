<%-- 
    Document   : Login
    Created on : 15 May 2024, 2:33:51 PM
    Author     : Liam Baron
--%>

<%@page import="java.util.List"%>
<%@page import="com.liambaron.authenclient.User"%>
<%@page import="com.liambaron.authenclient.AuthenWebService"%>
<%@page import="com.liambaron.authenclient.AuthenWebService_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <link rel="stylesheet" href="resources/static/css/bootstrap.min.css">
    <link rel="stylesheet" href="resources/static/css/forms.css">
    <link rel="stylesheet" href="resources/static/js/bootstrap.min.js">
    <jsp:useBean id="userBean" class="com.liambaron.authenclient.UserLogin" />
    <jsp
    
    <head>
        <title>Login</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <span class="border border-primary" >
            <div class="centre" >
                <form action="">
                    <label>Email</label><br>
                    <input type="text" id="email"><br>
                    <label>Password</label><br>
                    <input type="password" id="password" ><br><br>
                    <button type="button" class="btn btn-primary" onclick="check()">Login</button>
                </form><br><br>

                <p id="results"></p>
            </div>
        </span>
        
        <script>
            
            function check() {
                // Call the web service operation 'details()'
                <% AuthenWebService_Service service = new AuthenWebService_Service();
                    AuthenWebService port = service.getAuthenWebServicePort();
                    List<User> ans = port.details();

                    // Retrieve the values of the list
                    String email = "";
                    String pass = "";
                    for (User x: ans) {
                        email = x.getEmail();
                        pass = x.getPassword();
                    }
                %>
                    
                // Get the values in the form
                var email = document.getElementById("email").value;
                var pass = document.getElementById("password").value;
                
                // Get the values in the java variable email and pass that contains the information
                // the correct user
                var testEmail = "<%= email %>";
                var testPass = "<%= pass %>";
                
                // Checking if the fields are empty, if they are nothing will happen
                if (pass !== "" || email !== "") {
                    // Checks if the credentials are correct then displays the 'login successful' text
                    // Otherwise it will display 'login unsuccessful' text'
                    if (testPass === pass && testEmail === email) {
                        document.getElementById("results").innerHTML = "Login Successful!";
                        var colors = document.getElementById("results");
                        if (colors.classList.contains("text-danger")) {
                                colors.classList.remove("text-danger");
                            }
                        colors.classList.add("text-success"); 
                        }else {
                            document.getElementById("results").innerHTML = "Login Unsuccessful!";
                            var colors = document.getElementById("results");
                            
                            if (colors.classList.contains("text-success")) {
                                colors.classList.remove("text-success");
                            }
                            colors.classList.add("text-danger");
                        }
                }
            }             
        </script>
        
        
    </body>
</html>
