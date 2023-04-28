<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" type="text/css" href="../resources/css/signin.css">
<div id="root">
	<header id="header">
		<div id="header_box">
			<%@ include file="../include/header.jsp" %>
		</div>
	</header>
	<section id="content">
	   <form role="form" method="post" autocomplete="off">
		    <div class="input_area">
		     <label for="id">아이디</label>
		     <input type="text" id="id" name="id" required="required" />        
		    </div>
		    
		    <div class="input_area">
		     <label for="pwd">패스워드</label>
		     <input type="password" id="pwd" name="pwd" required="required" />        
		    </div>
		         
		    <button type="submit" id="signin_btn" name="signin_btn">로그인</button>
		    
		    <c:if test="${msg == false}">
		     <p style="color:#f00;">로그인에 실패했습니다.</p>
		    </c:if>
	   </form>     
</section>
</div>
<div>
	<footer id="footer">
		<div id="footer_box">
			<%@ include file="../include/footer.jsp" %>
		</div>		
	</footer>
</div>