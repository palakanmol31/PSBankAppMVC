<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>PSBankApp : create new account</title>
</head>
<body>
<h2>Create new Account</h2>
<form name="accountForm" action="saveAccount">
 <table>
 	<tr>
 	<td>Account #:</td>
 	<td><input type="text" name="accountNo"/></td>
 	</tr>
 	
 	<tr>
 	<td>Account Holder Name:</td>
 	<td><input type="text" name="accountHolderName"/></td>
 	</tr>
 	
 	<tr>
 	<td>Account Balance</td>
 	<td><input type="text" name="balance"/></td>
 	</tr>
 	
 	<tr>
 	<td colspan="2" align="center" >
 	<input type="submit" value= "Create Account" name="btnSubmit"/>
 	</tr>
 	
 </table>
</form>

</body>
</html>