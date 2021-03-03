<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC -HelloWorld</title>
<link rel="stylesheet" href="css/style.css">
</head>
 
 
<body>
<div class="topnav">
  <a class="active" href="#home">Home</a>
  <a href="#about">About</a>
  <c:choose>
     <c:when test="${sessionScope.un!=null}">
        hi: ${sessionScope.un}  <a href="Logout"> Logout </a> 
     </c:when>
     <c:otherwise> <a href="dangnhap"> Login </a>  </c:otherwise>
  </c:choose>
  <div class="search-container">
    <form action="timkiemController">
      <input type="text" placeholder="Search.." name="search">
      <button type="submit">Submit</button>
    </form>
  </div>
</div>
<table valign='center' width='1000'>
	<tr>
		<td valign="top">
		 <c:forEach items="${dsloai}" var="loai">
		    <a href='hello?ml=${loai.getMaloai()}'>   ${loai.getTenloai()}</a><hr>
		</c:forEach>
		</td>
		<td>
		    <c:forEach items="${dssach}" var="sach">
		         <img src="${sach.getAnh() }"><hr> ${sach.getTensach()} <hr>
		            ${sach.getGia()}  <hr>
		   </c:forEach>
		</td> 
	</tr> 
</table>

</body>
 
 
</html>