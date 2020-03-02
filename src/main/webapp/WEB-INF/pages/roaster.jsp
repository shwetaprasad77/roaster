<%@ page language="java" contentType="text/html; charset=US-ASCII"
import="java.util.*"%>
<%@ include file="include.jsp"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/WEB-INF/css/roaster.css">
</head>
<body>
<div class="dropdown">
	<p>Hi There!</p>
</div>

<div id="dp"></div>

<script type="text/javascript">
  var dp = new DayPilot.Month("dp");
  dp.startDate = "2016-01-01";
  dp.init();
</script>

</body>
</html>