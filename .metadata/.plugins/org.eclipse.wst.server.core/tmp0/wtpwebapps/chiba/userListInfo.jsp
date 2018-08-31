<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="description"content=""/>
<meta name="keywords"content=""/>
<title>userListInfo画面</title>

<style type="text/css">

body{
	margin:0;
	padding:0;
	line-height:1.6;
	letter-spacing:1px;
	font-family:Verdana,Helvetica,sana-serif;
	font-size:12px;
	color:#333;
	background:#fff;
}
table{
	text-aligin:center;
	margin:0 auto;
}

#top{
	width:780;
	margin:30px auto;
	border:1px solid #333;
}
#header{
	width:100%;
	height:80px;
	background-color:black;
}
#main{
	width:100%;
	height:500px;
	text-align:center;
}
#footer{
	width:100%;
	height:80px;
	background-color:black;
	clear:both;
}
#text-link{
	display: inline-block;
	text-align:right;
}
</style>
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>UserListInfo</p>
		</div>
		<div>
			<h3>ユーザー情報は以下になります。</h3>
			<table border=1>
				<tr>
					<td>登録ナンバー</td>
					<td>ログイン名</td>
					<td>パスワード</td>
					<td>ユーザ名</td>
					<td>登録日時</td>
				</tr>
				<s:iterator value="loginList">
				<tr>
					<td><s:property value="number"/></td>
					<td><s:property value="loginUserId"/></td>
					<td><s:property value="loginPassword"/></td>
					<td><s:property value="userName"/></td>
					<td><s:property value="insert_date"/></td>
				</tr>
				</s:iterator>
			</table>
			<s:form action="UserListInfoAction">

			</s:form>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>