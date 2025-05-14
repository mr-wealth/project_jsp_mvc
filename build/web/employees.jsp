<%-- 
    Document   : employees
    Created on : May 13, 2025, 10:13:59 PM
    Author     : brian
--%>

<%@page import="java.util.List"%>
<%@page import="mvc.model.Employee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Employee List</title>
    </head>
    <body>
        <h1>Employee List</h1>
        <table border ="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                </tr>
            </thead>
            <tbody>
                <%
                    List<Employee> employees = (List<Employee>)request.getAttribute("employees");
                    if (employees != null){
                        for(Employee employee : employees){
                %>
                <tr>
                    <td><%=employee.getId()%></td>
                    <td><%=employee.getFirstName()%></td>
                    <td><%=employee.getLastName()%></td>
                </tr>
                <%
                        }
                    }else {
                %>
                <tr>
                    <td colspan="3">No employees found.</td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
    </body> 
</html>
