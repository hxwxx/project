<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="../resources/css/signup.css">
<div id="root">
	<header id="header">
		<div id="header_box">
			<%@ include file="../include/header.jsp" %>
		</div>
	</header>
	<section id="container">
		<div id="container_box">
			
	<section id="content">
	   <form role="form" method="post" autocomplete="off">
	    <div class="input_area">
	     <label for="id">아이디</label>
	     <input type="text" id="id" name="id" placeholder="영문자" required="required" />        
	    </div>
	    
	    <div class="input_area">
	     <label for="pwd">패스워드</label>
	     <input type="password" id="pwd" name="pwd" required="required" />        
	    </div>
	    
	    <div class="input_area">
	     <label for="name">이름</label>
	     <input type="text" id="name" name="name" placeholder="이름을 입력해주세요" required="required" />        
	    </div>
	    
	    <div class="input_area">
	     <label for="mail">메일</label>
	     <input type="email" id="mail" name="mail" placeholder="example@mail.com" required="required" />        
	    </div>
	    
	     <div class="input_area">
	     <label for="phone">전화번호</label>
	     <input type="text" id="phone" name="phone" placeholder="010-0000-0000" required="required" />        
	    </div>
	    
	    <button type="submit" id="signup_btn" name="signup_btn">회원가입</button>
	    
  	 </form>     
</section>
		
		</div>
	</section>

	<footer id="footer">
		<div id="footer_box">
			<%@ include file="../include/footer.jsp" %>
		</div>		
	</footer>

</div>
</body>
</html>