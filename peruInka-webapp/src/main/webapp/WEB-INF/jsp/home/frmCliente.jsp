<%@ page import="org.springframework.web.util.UrlPathHelper"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%--@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>

Formulario Cliente : ${opc}<br>

${message}

<form:form commandName="cliente" action="saveCliente" method="POST">


Nombre: <form:input path="nombre" id="nombre"/><br>
ApePateno: <form:input path="apePaterno" id="apePaterno"/><br>
ApeMateno: <form:input path="apeMaterno" id="apeMaterno"/><br>
tipoDocumento: <form:input path="tipoDocumento" id="tipoDocumento"/><br>
nroDocumento: <form:input path="nroDocumento" id="nroDocumento"/><br>
nroTelefono: <form:input path="nroTelefono:" id="nroTelefono:"/><br>
estado: <form:input path="estado" id="estado"/><br>

<input type="hidden" name="opc" id="opc" value="${opc}"><br>

<button type="submit">Guardar</button>

</form:form>