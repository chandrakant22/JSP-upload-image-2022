<%@page import="model.ImageTbl"%>
<%@page import="java.util.List"%>
<%@page import="model.ImageTblDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Image</title>
<style type="text/css">
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}

</style>
</head>
<body>
<div align="center">
<table>
<tr>
<th>Id</th>
<th>Image Name</th>
</tr>

<%
List<ImageTbl> imageList=new ImageTblDao().getAllImage();
for(ImageTbl img:imageList)
{
%>
<tr>
<td><%=img.getId()%></td>
<td><img src="./upload/<%=img.getImageName()%>" width="200" height="200"></td>
</tr>
<%
}
%>

</table>
</div>
</body>
</html>