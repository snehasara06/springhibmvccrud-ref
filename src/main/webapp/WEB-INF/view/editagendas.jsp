<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
  <%@page import="com.kgisl.springhibernatemvccrud.model.Agenda"%>
  <form:form action="addagenda" method="post" modelAttribute="agenda">
    <table>
      <tr>
        <td>Agenda ID</td>
        <td>
          <form:input path="agendaId" /> <br />
          <form:errors path="agendaId" cssClass="error" />
        </td>
      </tr>
      <tr>
        <td>Time</td>
        <td>
          <form:input path="time" /> <br />
          <form:errors path="time" cssClass="error" />
        </td>
      </tr>
      <tr>
        <td>Description</td>
        <td>
          <form:input path="description" /> <br />
          <form:errors path="description" cssClass="error" />
        </td>
      </tr>
      <tr>
        <td>Instructor</td>
        <td>
          <form:input path="instructor" /> <br />
          <form:errors path="instructor" cssClass="error" />
        </td>
      </tr>
          <form:form action="addagenda" method="post">
  <tr>
    <td>Event</td>
    <td>
      <form:select path="event.eventId" modelAttribute="agenda">
        <form:option value="">Select an Event</form:option>
        <form:options items="${events}" itemValue="eventId" itemLabel="edition" />
      </form:select>
      <form:errors path="event" cssClass="error" />
    </td>
  </tr>

  <!-- Submit button -->
</form:form>

        </td>
      </tr>
      <tr>
        <td colspan="2"><button type="submit">Submit</button></td>
      </tr>
    </table>
  </form:form>

  <h1>Agenda Details</h1>
  <table>
    <tr>
      <th>Agenda ID</th>
      <th>Time</th>
      <th>Description</th>
      <th>Instructor</th>
      <th>Event</th>
    </tr>
    <c:forEach items="${agendas}" var="agenda">
      <tr>
        <td>${agenda.agendaId}</td>
        <td>${agenda.time}</td>
        <td>${agenda.description}</td>
        <td>${agenda.instructor}</td>
        <td>${agenda.event.edition}</td>
      </tr>
    </c:forEach>
  </table>
</body>
</html>
