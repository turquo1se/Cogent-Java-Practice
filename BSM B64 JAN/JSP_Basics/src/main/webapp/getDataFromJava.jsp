<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="model.MyClass" %> <%-- 1. import the class --%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



<%-- <% //MyClass m = new MyClass();%>  2. initiate an object --%>
<%-- <%=//m.getData() %> 3. display --%>


<jsp:useBean id="m" class="model.MyClass"></jsp:useBean> <%-- 4. different approach --%>



<jsp:setProperty name ="m" property="id" value="101"/> <%-- will call setter method internally --%>
<jsp:setProperty name ="m" property ="name" value= "black"/>


<jsp:getProperty property ="id" name ="m"/><%-- will call getter method internally --%>
<jsp:getProperty property ="name" name ="m"/>


<%=m.getData() %>
</body>
</html>