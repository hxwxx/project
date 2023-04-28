<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet" type="text/css" href="../resources/css/header.css">
<style>
@font-face {
    font-family: 'PF';
    src: url('../resources/font/PF.ttf') format('woff');
    font-weight: normal;
    font-style: normal;
}
*{
	font-family: 'PF';
}
</style>
<div id="h_wrap">
	<nav>
		<div id="logo">
			<a href="../board/list"><img src="../resources/img/logo.png" /></a>
		</div>
		<ul>
			<li class="logo_text"><a href="/">SLAM DUNK</a></li>
			<c:if test="${user == null}">
					<li><a href="../user/signin">로그인</a></li>
					<li><a href="../user/signup">회원가입</a></li>
			</c:if>
				<c:if test="${user != null}">
					<li><a href="../board/write">글쓰기</a>
					<li><a href="../user/signout">로그아웃</a></li>
				</c:if>
		</ul>
	</nav>
</div>
