<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 
<html>
<head>
     <title>register page</title>
     <center>
     <h1>Registeration</h1>
<style>
  .error {
      color: #EF1313;
      font-style: italic;
  }
</style>
</head>
<body>
 
<form:form action="rgistersavedata.htm" commandName="country">
<table cellpadding="2" border="2">
<tr>
    <td><font face="verdana" size="2px">CountryName</font></td>
    <td>:</td>
    <td>
    <font face="verdana" size="2">
    <form:input path="countryname" /> <form:errors path="countryname"></form:errors>
    </font>
    </td>
</tr>
<tr>
    <td><font face="verdana" size="2px">CountryCode</font></td>
    <td>:</td>
    <td>
    <font face="verdana" size="2">
    <form:input path="countrycode" /> <form:errors path="countrycode"></form:errors>
    </font>
    </td>
</tr>
<tr>
    <td><font face="verdana" size="2px">CountryLanguage</font></td>
    <td>:</td>
    <td>
    <font face="verdana" size="2">
    <form:input path="countrylan" /> <form:errors path="countrylan"></form:errors>
    </font>
    </td>
</tr>
<tr>
    <td><font face="verdana" size="2px">CountryPopulation</font></td>
    <td>:</td>
    <td>
    <font face="verdana" size="2">
    <form:input path="countrypop" /> <form:errors path="countrypop"></form:errors>
    </font>
    </td>
</tr>
<tr>

<tr>
    <td><font face="verdana" size="2px">CountrySpecial</font></td>
    <td>:</td>
    <td>
    <font face="verdana" size="2">
    <form:input path="countrysepc" /> <form:errors path="countrysepc"></form:errors>
    </font>
    </td>
</tr>
<tr>

<tr>
    <td><font face="verdana" size="2px">CountryNationalPlay</font></td>
    <td>:</td>
    <td>
    <font face="verdana" size="2">
    <form:input path="countrynationalplay" /> <form:errors path="countrynationalplay"></form:errors>
    </font>
    </td>
</tr>
<tr>


    <td>
    <input type="submit" value="Submit" />
    </td>
</tr>
</table>
</form:form>
</body>
</center>
</html>