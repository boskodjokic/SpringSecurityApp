<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
<title>Landing Page</title>

</head>

<body>

	<h2>Landing Page</h2>
	<hr>

	<p>Welcome to landing page!</p>

	<hr>

	<p>
		<a href="${pageContext.request.contextPath}/employees">Access
			Secure Site (requires login)</a>
	</p>

</body>

</html>
