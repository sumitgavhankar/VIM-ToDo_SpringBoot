
<%@page import="org.arpit.java2blog.model.Country"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<html>
<head>
<title>Success page</title>
<h1>Display Data</h1>

<script type="text/javascript">

function addBtn() {
	alert("Add Data Successfully");
	document.successdata.action="rgisterdata.htm";
	document.successdata.submit();
	
}

function deleteBtn() {
	alert("Delete Data Successfully");
	document.successdata.action="deletedata.htm";
	document.successdata.submit();
	
}

function editBtn() {
	alert("Edit Data Successfully");
	document.successdata.action="editdata.htm";
	document.successdata.submit();
	
}

</script>

</head>
<body>

<form name="successdata">
<table cellpadding="2" border="2">
<tr> 
<th>Id </th>
<th> C Name </th>
<th> C Code </th>
<th> C Language</th>
<th> C Population</th>
<th> C Special </th>
<th> C National Play</th>
</tr>

<%
ArrayList arrayList=(ArrayList) request.getAttribute("list");
Iterator iterator=arrayList.iterator();
while(iterator.hasNext()) {
	
	Country country=(Country) iterator.next();

%>

<tr>
 
 <td> <input type="radio" name="countruradioid" value=" <%=country.getId() %>"></td>
  <td> <%=country.getCountryname() %> </td>
  <td> <%=country.getCountrycode() %></td>
   <td> <%=country.getCountrylan() %></td>
    <td> <%=country.getCountrypop() %></td>
     <td> <%=country.getCountrysepc() %></td>
       <td> <%=country.getCountrynationalplay() %></td>
         
 </tr>

<%} %>



</table>

<input type="button" value="ADD" onclick="addBtn()">
<input type="button" value="Delete" onclick="deleteBtn()">
<input type="button" value="Edit" onclick="editBtn()">


</form>

</body>
</html>