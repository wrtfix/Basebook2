<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mytags"%>
<html>
<head>
<mytags:jquery />
<mytags:style />
</head>
<body>
	<mytags:menu />
	<!-- <h4>New Person</h4> -->

	<section id="main-content">
		<section class="wrapper site-min-height">
			<h3>
				<i class="fa fa-angle-right"></i> Agregar Usuario
			</h3>
			<div class="row mt">
				<div class="col-lg-12">

					<c:if test="${errors.errorCount gt 0}">
	Errors!<br />
						<c:forEach var="error" items="${errors.allErrors}">
							<span class="error">${error.objectName} ${error.code}</span>
							<br />
						</c:forEach>
					</c:if>
					<form method="post" action="addPerson.htm">
						<label for="name">Name:</label><input type="text" name="name" /><br />
						<label for="name">Age:</label><input type="text" name="age" /><br />
						<input type="submit" /><input type="reset" />
					</form>
				</div>
			</div>

		</section>
		<! --/wrapper -->
	</section>
	<!-- /MAIN CONTENT -->


	<mytags:footer />
	</section>

</body>
</html>
