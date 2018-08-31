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
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<title>ItemCreate画面</title>

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
</style>
<script type="text/javascript">
	function submitAction(url){
		$('form').attr('action',url);
		$('form').submit();
	}
</script>
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>ItemCreate画面</p>
		</div>
		<div>
			<s:if test="errorMassage !=''">
				<s:property value="errorMassage" escape="false"/>
			</s:if>
			<table>
				<s:form action="ItemCreateConfirmAction">
					<tr>
						<td><label>商品名</label></td>
						<td><input type="text" name="itemCreate_name" value=""></td>
					</tr>
					<tr>
						<td><label>値段</label></td>
						<td><input type="text" name="itemCreate_price" value=""><span>円</span></td>
					</tr>
					<tr>
						<td><label>在庫数</label></td>
						<td><input type="text" name="itemCreate_stock" value=""><span>個</span></td>
					</tr>
					<s:submit value="追加"/>
				</s:form>
				<tr>
					<td>
						<input type="button" value="戻る" onclick="submitAction('ManagerPageAction')"/>
					</td>
				</tr>
			</table>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>