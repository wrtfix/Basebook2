<%@ taglib tagdir="/WEB-INF/tags" prefix="mytags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<head>
  <mytags:style />
  <mytags:jquery />
  <title></title>
</head>
<!-- <body onload='document.loginForm.username.focus();'> -->

<!-- 	<h1>Spring Security Custom Login Form (XML)</h1> -->
<body>
<!-- 	<div id="login-box"> -->

<!-- 		<h3>Login with Username and Password</h3> -->

<%-- 		<c:if test="${not empty error}"> --%>
<%-- 			<div class="error">${error}</div> --%>
<%-- 		</c:if> --%>
<%-- 		<c:if test="${not empty msg}"> --%>
<%-- 			<div class="msg">${msg}</div> --%>
<%-- 		</c:if> --%>

<!-- 		<form name='loginForm' -->
<%-- 			action="<c:url value='/j_spring_security_check' />" method='POST'> --%>

<!-- 			<table> -->
<!-- 				<tr> -->
<!-- 					<td>User:</td> -->
<!-- 					<td><input type='text' name='username'></td> -->
<!-- 				</tr> -->
<!-- 				<tr> -->
<!-- 					<td>Password:</td> -->
<!-- 					<td><input type='password' name='password' /></td> -->
<!-- 				</tr> -->
<!-- 				<tr> -->
<!-- 					<td colspan='2'><input name="submit" type="submit" -->
<!-- 						value="submit" /></td> -->
<!-- 				</tr> -->
<!-- 			</table> -->

<%-- 			<input type="hidden" name="${_csrf.parameterName}" --%>
<%-- 				value="${_csrf.token}" /> --%>

<!-- 		</form> -->
<!-- 	</div> -->

<!-- </body> -->
<body>
      <!-- **********************************************************************************************************************************************************
      MAIN CONTENT
      *********************************************************************************************************************************************************** -->

	  <div id="login-page">
	  	<div class="container">
	  	
		      <form class="form-login" name="loginForm" action="<c:url value='/j_spring_security_check' />" method='POST'>
		        <h2 class="form-login-heading">Ingresar</h2>
		        <div class="login-wrap">
		       	<c:if test="${not empty error}">
					<div class="error">${error}</div>
				</c:if>
				<c:if test="${not empty msg}">
					<div class="msg">${msg}</div>
				</c:if>
		            <input type="text" class="form-control" placeholder="Usuario" autofocus name='username'>
		            <br>
		            <input type="password" class="form-control" placeholder="Clave" name='password'>
		            <label class="checkbox">
		                <span class="pull-right">
		                    <a data-toggle="modal" href="login.html#myModal"> Olvido su contraseña?</a>
		
		                </span>
		            </label>
		            <button class="btn btn-theme btn-block" type="submit"><i class="fa fa-lock"></i> Ingresar</button>
		            <hr>
		            
		            <div class="login-social-link centered">
		            <p>tambien puedes loguear con</p>
		                <button class="btn btn-facebook" type="submit"><i class="fa fa-facebook"></i> Facebook</button>
		                <button class="btn btn-twitter" type="submit"><i class="fa fa-twitter"></i> Twitter</button>
		            </div>
		            <div class="registration">
		                No tenes una cuenta aun?<br/>
		                <a class="" href="#">
		                    Registrate
		                </a>
		            </div>
		
		        </div>
		
<!-- 		          Modal -->
<!-- 		          <div aria-hidden="true" aria-labelledby="myModalLabel" role="dialog" tabindex="-1" id="myModal" class="modal fade"> -->
<!-- 		              <div class="modal-dialog"> -->
<!-- 		                  <div class="modal-content"> -->
<!-- 		                      <div class="modal-header"> -->
<!-- 		                          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button> -->
<!-- 		                          <h4 class="modal-title">Forgot Password ?</h4> -->
<!-- 		                      </div> -->
<!-- 		                      <div class="modal-body"> -->
<!-- 		                          <p>Enter your e-mail address below to reset your password.</p> -->
<!-- 		                          <input type="text" name="email" placeholder="Email" autocomplete="off" class="form-control placeholder-no-fix"> -->
		
<!-- 		                      </div> -->
<!-- 		                      <div class="modal-footer"> -->
<!-- 		                          <button data-dismiss="modal" class="btn btn-default" type="button">Cancel</button> -->
<!-- 		                          <button class="btn btn-theme" type="button">Submit</button> -->
<!-- 		                      </div> -->
<!-- 		                  </div> -->
<!-- 		              </div>o -->
<!-- 		          </div> -->
		          <!-- modal -->
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		      </form>	  	
	  	
	  	</div>
	  </div>

    <!-- js placed at the end of the document so the pages load faster -->
<!--     <script src="assets/js/jquery.js"></script> -->
<!--     <script src="assets/js/bootstrap.min.js"></script> -->

    <!--BACKSTRETCH-->
    <!-- You can use an image of whatever size. This script will stretch to fit in any screen size.-->
<!--     <script type="text/javascript" src="assets/js/jquery.backstretch.min.js"></script> -->
    <script>
        $.backstretch("assets/img/login-bg.jpg", {speed: 500});
    </script>
    </body>
</html>


</html>