<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="GBK"%>
<%@ page import="java.util.*,com.opensymphony.xwork2.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>The books</title>
</head>
<body>
	<table border="1" >
		<caption>作者李刚的书</caption>
		<%
			ValueStack vs = (ValueStack) request
					.getAttribute("struts.valueStack");
			String[] books = (String[]) vs.findValue("books");
			for (String book : books) {
		%>
		<tr>
			<td>书名:</td>
			<td><%=book%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>