<%@ page language="java" contentType="text/html; charset=US-ASCII"
import="java.util.*"%>
<%@ include file="/WEB-INF/jsp/include.jsp"%>
<%@ taglib prefix="spring"
	uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome ${username}

<form action="dashboard" method="post">
     <input type="submit" value="Submit" />
    
    <section class="container">
  <div class="dropdown">
    <select name="key" class="dropdown-select">
      <option value="">Select…</option>
      <option value="1">Option #1</option>
      <option value="2">Option #2</option>
      <option value="3">Option #3</option>
    </select>
  </div>
  <div class="dropdown dropdown-dark">
    <select name="constant" class="dropdown-select">
      <option value="">Select…</option>
      <option value="1">Option #1</option>
      <option value="2">Option #2</option>
      <option value="3">Option #3</option>
    </select>
    
    <select name="members">
        <jstlcore:forEach items="${members}" var=members>
            <option value="${members.name}">${members.name}</option>
        </jstlcore:forEach>
    </select>
  </div>
</section>
</form>
</body>
</html>