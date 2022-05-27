<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>

<body>


<h2> Dear Employee, you are Welcome!</h2>

<br>
<br>
<br>


<%--Your name: ${param.employeeName}--%>

Your name: ${employee.name}
<br>
Your surname: ${employee.surName}
<br>
Your salary:${employee.salary}
<br>
Your department: ${employee.department}
<br>
Your Car: ${employee.carBrand}
<br>
Languages
<ul>

<c:forEach var="lang" items="${employee.languages}">

<li>${lang}</li>

</c:forEach>

</ul>
</body>

</html>