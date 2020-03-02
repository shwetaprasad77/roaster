<%@ page language="java" contentType="text/html; charset=US-ASCII"
import="java.util.*"%>
<%@ include file="include.jsp"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/homestyle.css">
<title>Insert title here</title>
</head>
<body>


Welcome ${resource.name}

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
    
    <select name="member">
        <jstlcore:forEach items="${memberList}" var="memberList">
            <option value="${memberList.resourceId}">${memberList.name}</option>
        </jstlcore:forEach>
    </select>
  </div>
</section>
</form>
</body>
</html>