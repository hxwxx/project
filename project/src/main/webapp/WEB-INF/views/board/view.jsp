<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="../resources/css/view.css">

<div id="root">
	<header id="header">
		<div id="header_box">
			<%@ include file="../include/header.jsp" %>
		</div>
	</header>
	<section id="content">
		<form method="post">
			<label>제목</label>
			<input type="text" name="title" value="${view.title}" /><br />
			
			<label>작성자</label>
			<input type="text" name="writer" value="${view.writer}"/><br />
			
			<label>내용</label>
			<textarea cols="50" rows="5" name="content" >${view.content}</textarea><br />		
		</form>
		<div>
			<a href="/board/modify?bno=${view.bno }"><button>게시글 수정</button></a>
			<a href="/board/delete?bno=${view.bno }"><button>게시글 삭제</button></a>
		</div>
	</section>
</div>
<div>
	<footer id="footer">
		<div id="footer_box">
			<%@ include file="../include/footer.jsp" %>
		</div>		
	</footer>
</div>
