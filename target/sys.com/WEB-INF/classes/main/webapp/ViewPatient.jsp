<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<%@ include file="header.jsp" %>
<div class="row">
<div class="col-sm-4">
<%@ include file="admin_sidebar.jsp" %>
</div>
<div class="col-sm-8">
<div class="panel">
<div class="panel-heading"style="background-color: #FF00FF;color: white;">
<h3 style="text-align:center;font-family:lucida bright;">View Doctor</h3>
</div><!-- end of panel heading -->
<div class="panel-body">
<%@ page import="com.myclasses.Connect" %>
	<%@ page import="com.ClinicInterfaces.NurseI" %>
	<%@ page import="java.util.Iterator" %>
	<%@ page import="com.myclasses.Patient" %>
	<table class="table">
		<thead>
		<tr>
			<th>Name</th>

			<th>ID Number</th>
			<th>Phone</th>
			<th>Email</th>
			<th>Gender</th>

		</tr>
		</thead>
		<%
NurseI b = (NurseI) request.getAttribute("pat");
	Iterator <Patient> itr = b.viewPatientsData().iterator();
			Patient q = itr.next();
	while (itr.hasNext()) {
%>
		<tr>
			<td><%=q.getName()%></td>
			<td><%=q.getIdNo()%></td>
			<td><%=q.getPhone()%></td>
			<td><%=q.getEmail()%></td>
			<td><%=q.getGender()%></td>

			<%--<td><a href="delete.jsp?deleteId=<%=q.getIdNo() %>"class="btn"style="background-color: package com.myclasses;--%>

};color: white;">Delete</a></td>
</tr>
<% }  %>
</table>
</div><!-- End of panel body -->
</div><!-- End of panel -->
</div><!-- End of col-sm-8 -->
</div><!-- End of row -->
<%@ include file="footer.jsp" %>