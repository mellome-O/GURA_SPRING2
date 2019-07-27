<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>views/friend/list.jsp</title>
</head>
<body>
<h1>친구목록 입니다</h1>
<table>
	<thead>
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>주소</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach var="tmp" items="${list}">
		<tr>
			<td>${tmp.num}</td>
			<td>${tmp.name}</td>
			<td>${tmp.addr}</td>
		</tr>
	</c:forEach>
	</tbody>
</table>
</body>
</html>