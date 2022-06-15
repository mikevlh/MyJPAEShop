<%-- 
    Document   : customer
    Created on : Jun 14, 2022, 3:52:22 PM
    Author     : George.Pasparakis
--%>

<%@page import="java.util.HashSet"%>
<%@page import="models.Customer"%>
<%@page import="java.util.Set"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customers' Details</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>
    <body>
        <div class='container'>
            <a class='btn btn-primary' href='<%= request.getContextPath() + "/NewCustomer" %>'>Create a new Customer</a>
            <h1>Customers' Data</h1>
            <div class='row border-top border-bottom border-secondary'>
                <div class='col fs-4 fw-bold'>Id</div>
                <div class='col fs-4 fw-bold'>First Name</div>
                <div class='col fs-4 fw-bold'>Last Name</div>
                <div class='col fs-4 fw-bold'>Email</div>
            </div>
            <c:forEach items="${customers}" var="customer">
                <div class='row border-bottom border-primary'>
                        <div class='col'>${customer.getId()}</div>
                        <div class='col'>${customer.getFirstName()}</div>
                        <div class='col'>${customer.getLastName()}</div>
                        <div class='col'>${customer.getEmail()}</div>
                </div>
            </c:forEach>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>
