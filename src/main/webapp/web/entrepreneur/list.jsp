<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="/silkadmin/css/s2.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="/silkadmin/js/jquery-1.2.2.pack.js"></script>
<title>Entrepreneur</title>
</head>
<body>
	<h1>Entrepreneur</h1>
	<a href="edit">add</a><br><br>
	<s:if test="entrepreneurList.size() > 0">
		<table class="userTable" cellpadding="5px" width="90%">
		<tr class="even">
			<th>Id</th>
			<th>Company Name</th>
			<th>Address</th>
			<th>Phone</th>
			<th></th>

			
		</tr>
			<s:iterator value="entrepreneurList" status="userStatus">
				<tr
					class="<s:if test="#userStatus.odd == true ">odd</s:if> <s:else>even</s:else>">
					<td><s:property value="id" /></td>
					<td><s:property value="companyName" /></td>
					<td><s:property value="address" /></td>
					<td><s:property value="phone" /></td>
					<td><s:url id="editURL" action="edit">
							<s:param name="id" value="%{id}"></s:param>
						</s:url> <s:a href="%{editURL}">Edit</s:a></td>
				</tr>
			</s:iterator>
		</table>
	</s:if>
</body>
<br><br><br>
<a href="..">Menu</a>
<script type="text/javascript" src="/silkadmin/js/myjs.js"></script>
</html>