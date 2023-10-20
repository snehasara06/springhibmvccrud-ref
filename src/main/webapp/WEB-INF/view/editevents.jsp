<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Spring5 MVC Hibernate Demo</title>
  <style type="text/css">
    .error {
      color: red;
    }
    table {
      width: 50%;
      border-collapse: collapse;
      border-spacing: 0px;
    }
    table td {
      border: 1px solid #565454;
      padding: 20px;
    }
  </style>
</head>
<body>
  <h1>Input Form</h1>
  <%@page import="com.kgisl.springhibernatemvccrud.model.Event"%>
  <form action="addevent" method="post" modelAttribute="event">
    <table>
      <tr>
        <td>Edition</td>
        <td>
          <input type="text" name="edition" /> <br />
          <!-- Add validation error message -->
          <c:if test="${not empty editionError}">
            <span class="error">${editionError}</span> <br />
          </c:if>
        </td>
      </tr>
      <tr>
        <td>Date</td>
        <td>
          <input type="text" name="date" /> <br />
          <!-- Add validation error message -->
          <c:if test="${not empty dateError}">
            <span class="error">${dateError}</span> <br />
          </c:if>
        </td>
      </tr>
      <tr>
        <td>Location</td>
        <td>
          <input type="text" name="location" /> <br />
          <!-- Add validation error message -->
          <c:if test="${not empty locationError}">
            <span class="error">${locationError}</span> <br />
          </c:if>
        </td>
      </tr>
      <tr>
        <td>Active</td>
        <td>
          <input type="text" name="isActive" /> <br />
          <!-- Add validation error message -->
          <c:if test="${not empty isActiveError}">
            <span class="error">${isActiveError}</span> <br />
          </c:if>
        </td>
      </tr>
      <tr>
        <td colspan="2">
          <button type="submit">Submit</button>
        </td>
      </tr>
    </table>
  </form>

  <h2>Events List</h2>
<table>
  <tr>
    <td><strong>Edition</strong></td>
    <td><strong>Date</strong></td>
    <td><strong>Location</strong></td>
    <td><strong>Active</strong></td>
    <td><strong>Agenda</strong></td>
  </tr>
  <table>
    <c:forEach items="${events}" var="event">
      <tr>
        <td>${event.edition}</td>
        <td>${event.date}</td>
        <td>${event.location}</td>
        <td>${event.isActive}</td>
        <td>
          <table>
            <c:forEach items="${event.agendas}" var="agenda">
              <tr>
                <td>${agenda.agendaId}</td>
                <td>${agenda.time}</td>
                <td>${agenda.description}</td>
                <td>${agenda.instructor}</td>
              </tr>
            </c:forEach>
          </table>
        </td>
      </tr>
    </c:forEach>
  </table>
</table>

</body>
</html>
