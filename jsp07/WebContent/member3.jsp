<%@page import="shop.MemberDAO"%>
<%@page import="shop.MemberDTO"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
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
	// 브라우저가 보낸 요청을 웹서버가 받음
		String id = request.getParameter("id");
		String tel = request.getParameter("tel");
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		dto.setId(tel);
		dao.update(dto);
	%>
	회원 정보 수정 신청되었습니다.
</body>
</html>