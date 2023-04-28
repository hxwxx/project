<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insert title here</title>
</head>
<body>
	<table>
	 <thead>
	  <tr>
	   <th>아이디</th>
	   <th>비밀번호</th>
	   <th>이름</th>
	   <th>메일</th>
	   <th>전화번호</th>
	   <th>상태</th>
	  </tr>
	 </thead>
	 
	 <tbody>
	  <c:forEach items="${list}" var="list">
		 <tr>
		  <td>${list.id}</td>
		  <td>${list.pwd}</td>
		  <td>${list.name}</td>
		  <td>${list.mail}</td>
		  <td>${list.phone}</td>
		  <td>${list.status}</td>
		 </tr>
		</c:forEach>
	 </tbody>

</table>
</body>
</html>