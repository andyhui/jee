<%@ page contentType="text/html; charset=GBK" language="java"
	errorPage=""%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BGK" />
<title>login page</title>
</head>
<body>
	<s:form action="login">
		<s:textfield name="username" label="�û���" />
		<s:textfield name="password" label="�� ��" />
		<s:submit value="��¼" />
	</s:form>
</body>
</html>


