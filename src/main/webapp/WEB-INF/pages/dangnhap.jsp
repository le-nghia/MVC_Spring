<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method='post' action='dangnhap'>
      <input name='txtun' type='text'><br>
      <input name='txtpass' type='password'><br>
      <input name='but1' type='submit' value='Login'><br>
     <c:if test="${tb == 'dns'}">
    <b> tb:<c:out value="Dang nhap sai"></c:out>  </b>
   </c:if>
</form>

</body>
</html>