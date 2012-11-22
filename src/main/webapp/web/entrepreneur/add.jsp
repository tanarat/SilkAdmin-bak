<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add New Entrepreneur</title>
</head>
<body>
<h2>Entrepreneur</h2>

<s:form action="saveOrUpdate" >
<s:push value="entrepreneur">
  <s:hidden name="id" />
  <s:textfield name="companyName" label="Company Name" size="70" /><br>
  <s:textarea name="address" label="Address" cols="50" rows="3"/><br>
  <s:textfield name="phone" label="Phone" size="70"/><br>
  <s:submit value="Save"/>
</s:push>
</s:form>

<a href="list">view</a>

</body>
</html>