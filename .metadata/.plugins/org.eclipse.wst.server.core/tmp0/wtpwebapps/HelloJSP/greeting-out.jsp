<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>Test</title>
</head>
<body>

<% request.setCharacterEncoding("utf-8"); %>
<p>こんにちは、<%=request.getParameter("user") %>さん！</p>
</body>
</html>