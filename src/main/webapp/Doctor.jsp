<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<%@ include file="header.jsp" %>
<div class="row">
<div class="col-sm-4">
<%@ include file="sidebar.jsp" %>
</div>
<div class="col-sm-8">
<div class="panel">
<div class="panel-heading"style="background-color: #FF00FF;color: white;">
<h3 style="text-align:center;font-family:lucida bright;">Doctor Prescription and Diagnosis</h3>
</div><!-- end of panel heading -->
<div class="panel-body">
<%@ page import="com.myclasses.Connect" %>
<form action="prescribe"method="post"class="form-horizontal">
<div class="form-group">
<label class="col-sm-3 control-label">Select IDNo</label>
<div class="col-sm-9">
<select name="idno"class="form-control">
<%
Connect con=new Connect();
ResultSet rs=null;
con.getCon();
String getEmployees="SELECT * FROM person WHERE role IS NULL";
rs=con.queryDatabase(getEmployees);
while(rs.next())
{
	
	int idNo=rs.getInt("idNo");

%>
<option value="<%=idNo %>"><%=idNo %></option>
<% } %>
</select>
</div><!-- End of col-sm-9 -->
</div><!-- End of form group -->
<div class="form-group">
<label class="col-sm-3 control-label">Diagnos</label>
<div class="col-sm-9">
<textarea rows="5"class="form-control"name="diagnos"></textarea>
</div><!-- End of col-sm-9 -->
</div><!-- End of form group -->
<div class="form-group">
<label class="col-sm-3 control-label">Prescribe</label>
<div class="col-sm-9">
<textarea rows="5"class="form-control"name="prescribe"></textarea>
</div><!-- End of col-sm-9 -->
</div><!-- End of form group -->
<div class="form-group">
<label class="col-sm-3 control-label"></label>
<div class="col-sm-9">
<input type="submit"value="Submit"class="btn pull-right"style="background-color: #FF00FF;color: white;">
</div><!-- End of col-sm-9 -->
</div><!-- End of form group -->
</form>
</div><!-- End of panel body -->
</div><!-- End of panel -->
</div><!-- End of col-sm-8 -->
</div><!-- End of row -->
<%@ include file="footer.jsp" %>