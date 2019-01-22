<%@page import="shop.BbsDTO"%>
<%@page import="shop.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id = request.getParameter("id");

	BbsDAO dao = new BbsDAO();
	BbsDTO dto = new BbsDTO();
	
	dto.setId(id);
	
	dao.delete(dto);
	
%>
</body>
</html>