<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<script>
		function formSubmit() {
			document.getElementById("logoutForm").submit();
		}
	</script>
	<c:url value="/j_spring_security_logout" var="logoutUrl" />
	<form action="${logoutUrl}" method="post" id="logoutForm">
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
	</form>

<a href="index.jsp">Home</a>
<a href="allPersons.htm">All Persons</a>
<a href="addPerson.htm">Add Person</a>
<a href="javascript:formSubmit()"> Logout</a>
<hr />
